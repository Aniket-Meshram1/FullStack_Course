package com.main;

import java.util.List;
import java.util.Scanner;

import com.exception.AuthenticationException;
import com.exception.InsufficientBalanceException;
import com.exception.InvalidAmountException;
import com.model.Account;
import com.model.Transaction;
import com.model.User;
import com.repository.TransactionRepository;
import com.service.BankService;

public class BankApp {

	private static BankService bankService = new BankService();
	private static TransactionRepository transactionRepo = new TransactionRepository();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		User loggedInUser = null;
		Account account = null;

		while (true) {
			System.out.println("\n===== BANKING APPLICATION =====");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();
			sc.nextLine();

			try {
				switch (choice) {
				case 1:
					// -------- REGISTER --------
					System.out.print("Enter username: ");
					String username = sc.nextLine();

					System.out.print("Enter password: ");
					String password = sc.nextLine();

					System.out.print("Enter account number: ");
					String accNo = sc.nextLine();

					System.out.print("Enter account type: ");
					String accType = sc.nextLine();

					System.out.print("Enter email: ");
					String email = sc.nextLine();

					System.out.print("Enter phone: ");
					String phone = sc.nextLine();

					User user = new User(username, password);
					Account newAccount = new Account(accNo, 0, accType, email, phone);

					account = bankService.register(user, newAccount);

					System.out.println("Registration successful!");
					break;

				case 2:
					// -------- LOGIN --------

					System.out.print("Enter username: ");
					String loginUser = sc.nextLine();

					System.out.print("Enter password: ");
					String loginPass = sc.nextLine();

					loggedInUser = bankService.login(loginUser, loginPass);

					account = bankService.getAccountForUser(loggedInUser.getUserId());

					if (account == null) {
						System.out.println("No account found for this user");
						break;
					}

					System.out.println("Login successful!");

					// -------- USER MENU --------
					userMenu(sc, loggedInUser, account);
					break;

				case 3:
					System.out.println("Thank you for using the bank app!");
					sc.close();
					System.exit(0);

				default:
					System.out.println("Invalid option");
				}

			} catch (AuthenticationException | InvalidAmountException | InsufficientBalanceException e) {
				System.out.println( e.getMessage());
			}
		}
	}

	private static void userMenu(Scanner sc, User user, Account account)
			throws InvalidAmountException, InsufficientBalanceException {

		while (true) {
			System.out.println("\n===== USER MENU =====");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Transaction History");
			System.out.println("5. Change Password");
			System.out.println("6. Logout");
			System.out.print("Choose Option : ");

			int choice = sc.nextInt();
			try {
				switch (choice) {
				case 1:
					System.out.println("Current Balance: " + user.getBalance());
					break;

				case 2:
					System.out.print("Enter amount to deposit: ");
					double depAmount = sc.nextDouble();
					bankService.deposit(user, account.getAccountNumber(), depAmount);
					System.out.println("Deposit successful");
					break;

				case 3:
					System.out.print("Enter amount to withdraw: ");
					double wdAmount = sc.nextDouble();
					bankService.withdraw(user, account.getAccountNumber(), wdAmount);
					System.out.println("Withdraw successful");
					break;

				case 4:
					List<Transaction> transactions = transactionRepo.findByAccountNumber(account.getAccountNumber());

					System.out.println("\n--- TRANSACTION HISTORY ---");
					for (Transaction tx : transactions) {
						System.out.println(
								tx.getTransactionDate() + " | " + tx.getTransactionType() + " | " + tx.getAmount());
					}
					break;

				case 5:
					sc.nextLine(); // clear buffer

					System.out.print("Enter old password: ");
					String oldPass = sc.nextLine();

					System.out.print("Enter new password: ");
					String newPass = sc.nextLine();

					bankService.changePassword(user, oldPass, newPass);
					System.out.println("Password changed successfully");
					break;

				case 6:
					System.out.println("Logged out successfully!");
					return;

				default:
					System.out.println("Invalid option");
				}
			} catch (AuthenticationException | InvalidAmountException | InsufficientBalanceException e) {
				System.out.println( e.getMessage());
			}
		}
	}
}
