package com.model;

public class User {
	private int account_No;
	private String name;
	private String password;
	private double balance;
	public User(int account_No, String name, String password, double balance) {
		super();
		this.account_No = account_No;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	public int getAccount_No() {
		return account_No;
	}
	public void setAccount_No(int account_No) {
		this.account_No = account_No;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean checkPass(String password) {
		return this.password.equals(password);
	}
	public void deposit(double amount) {
		this.balance+=amount;
		
	}
	public boolean withdraw(double amount) {
		if(amount>this.balance) {
			return false;
		}
		this.balance-=amount;
		return true;
	}
}
