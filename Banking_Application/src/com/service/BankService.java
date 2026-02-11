package com.service;

import com.exception.AuthenticationException;
import com.exception.InsufficientBalanceException;
import com.exception.InvalidAmountException;
import com.model.Account;
import com.model.Transaction;
import com.model.User;
import com.repository.AccountRepository;
import com.repository.TransactionRepository;
import com.repository.UserRepository;

public class BankService {

	private UserRepository userRepo = new UserRepository();
	private AccountRepository accountRepo = new AccountRepository();
	private TransactionRepository transactionRepo = new TransactionRepository();

	// ================= LOGIN =================
	public User login(String username, String password) throws AuthenticationException {

		User user = userRepo.findByUsername(username);

		if (user == null || !user.getPassword().equals(password)) {
			throw new AuthenticationException("Invalid username or password");
		}
		return user;
	}

	// ================= REGISTER =================
	public Account register(User user, Account account) {

		int userId = userRepo.save(user);

		Account newAccount = new Account(account.getAccountNumber(), userId, account.getAccountType(),
				account.getEmail(), account.getPhone());

		accountRepo.save(newAccount);
		return newAccount;
	}

	// ================= DEPOSIT =================
	public void deposit(User user, String accountNumber, double amount) throws InvalidAmountException {

		if (amount <= 0) {
			throw new InvalidAmountException("Amount must be greater than zero");
		}

		double newBalance = user.getBalance() + amount;

		userRepo.updateBalance(user.getUserId(), newBalance);
		transactionRepo.save(new Transaction(accountNumber, "DEPOSIT", amount));

		user.setBalance(newBalance);
	}

	// ================= WITHDRAW =================
	public void withdraw(User user, String accountNumber, double amount)
			throws InvalidAmountException, InsufficientBalanceException {

		if (amount <= 0) {
			throw new InvalidAmountException("Amount must be greater than zero");
		}

		if (user.getBalance() < amount) {
			throw new InsufficientBalanceException("Insufficient balance");
		}

		double newBalance = user.getBalance() - amount;

		userRepo.updateBalance(user.getUserId(), newBalance);
		transactionRepo.save(new Transaction(accountNumber, "WITHDRAW", amount));

		user.setBalance(newBalance);
	}

	public Account getAccountForUser(int userId) {
		return accountRepo.findByUserId(userId);
	}
//====================UPDATE PASSWORD============================

	public void changePassword(User user, String oldPassword, String newPassword)
			throws AuthenticationException, InvalidAmountException {

		if (!user.getPassword().equals(oldPassword)) {
			throw new AuthenticationException("Old password is incorrect");
		}

		if (newPassword == null || newPassword.length() < 4) {
			throw new InvalidAmountException("Password must be at least 4 characters");
		}

		userRepo.updatePassword(user.getUserId(), newPassword);
		user.setPassword(newPassword);
	}

}
