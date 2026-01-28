package com.service;
import com.repository.*;
import com.exception.AuthenticationException;
import com.exception.InsufficientBalanceException;
import com.exception.InvalidAmountException;
import com.model.*;

import java.util.HashMap;
import java.util.Map;

public class BankService {
	private static int acc_No = 100001;
	UserRepository userRepo = new UserRepository();
	public User registerUser(String name, String password) {
		
		User user = new User(acc_No, name, password, 0.0);
		userRepo.saveUser(user);
		acc_No++;
		return user;
		
	}
	public User login(int acc_No,String password)  throws AuthenticationException{
		User user = userRepo.findUser(acc_No);
		if (user == null || !user.getPassword().equals(password)) {
            throw new AuthenticationException("Invalid account number or password");
        }
		System.out.println("Login Successfully!!\n"+"Welcome "+user.getName());
        return user;
		}
	
	public void deposit(User user,double amount) throws InvalidAmountException {
		if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero");
        }
        user.deposit(amount);
	}
	
	public boolean withdraw(User user,double amount)  throws InvalidAmountException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero");
        }

        if (user.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
    
		return user.withdraw(amount);
	}
	
	public double checkBalance(User user) {
		return user.getBalance();
		
	}
	public boolean changePass(User user ,String oldPass , String newPass) {
		if(user.getPassword().equals(oldPass)) {
			user.setPassword(newPass);
			return true;
		}
		return false;
	}
}
