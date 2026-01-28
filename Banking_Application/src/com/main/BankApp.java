package com.main;

import java.util.Scanner;

import com.exception.AuthenticationException;
import com.exception.InsufficientBalanceException;
import com.exception.InvalidAmountException;
import com.model.User;
import com.service.BankService;

public class BankApp {
	private static BankService bs = new BankService();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		while(true) {
			 System.out.println("\n--- Banking Application ---");
	            System.out.println("1. Register");
	            System.out.println("2. Login");
	            System.out.println("3. Exit");
	            System.out.print("Choose option: ");
	            int choice = sc.nextInt();
	            sc.nextLine();
	            
	            
	            switch(choice) {
	            case 1 :
	            	register();
	            	break;
	            case 2 :
	            	login();
	            	break;
	            case 3:
	            	System.out.println("Thank you for using Banking App!!!!");
	            	System.exit(0);
	            default:
	            	System.out.println("Invalid Choice");
	            }
		}

	}
	
			private static void register() {
				System.out.print("Enter Name : ");
				
				String name = sc.nextLine();
				System.out.print("Enter the Password : ");
				String pass = sc.nextLine();
				User user = bs.registerUser(name, pass);
				System.out.println("Account Created Successfully.");
				System.out.println("Your Account Number : "+ user.getAccount_No());
			}
			
			private static void login() {
				try{
				System.out.print("Enter the Account number : ");
				int acc = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the Password : ");
				String pass = sc.nextLine();
				User user = bs.login(acc, pass);
				if(user == null) {
					System.out.println("Invalid Credentials !");
					return;
				}
				userMenu(user);
				}catch (AuthenticationException e) {
					System.out.println(e.getMessage());
			    }
				
			}
			
			
			private static void userMenu(User user) {
				while(true) {
					System.out.println("\n--- Welcome " + user.getName() + " ---");
		            System.out.println("1. Deposit");
		            System.out.println("2. Withdraw");
		            System.out.println("3. Check Balance");
		            System.out.println("4. Change Password");
		            System.out.println("5. Logout");
		            System.out.print("Choose option: ");
		            int choice = sc.nextInt();
		            sc.nextLine();
		            switch(choice) {
		            case 1:
		            	try{
		            		System.out.print("Enter Amount to deposit : ");
		            	
		            	double deposit = sc.nextDouble();
		            	bs.deposit(user, deposit);
		            	System.out.println("Amount deposited successfully!");
		            
		            	}catch (InvalidAmountException e) {
		                    System.out.println(e.getMessage());
		                    sc.nextLine();
		                }finally {
		                	break;
		                }
		            case 2:
		            	try {
		            	System.out.print("Enter Amount to withdraw : ");
		            	double withdraw = sc.nextDouble();
		            	
		            	if(bs.withdraw(user, withdraw)) {
		            		System.out.println("Withdrawal Successful!");
		            	}
		            	
		            	}catch (InvalidAmountException | InsufficientBalanceException e) {
		                    System.out.println(e.getMessage());
		                    sc.nextLine();
		                }finally {
		                	break;
		                }
		            	
		            case 3:
		            	System.out.println("Current Balance : "+bs.checkBalance(user));
		            	break;
		            case 4:
		            	System.out.print("Enter old Password : ");
		            	String oldPass = sc.nextLine();
		            	System.out.print("Enter the new Password : ");
		            	String newPass = sc.nextLine();
		            	if(bs.changePass(user, oldPass, newPass)) {
		            		System.out.println("Password Changed Successfully!");
		            	}
		            	else {
		            		System.out.println("Incorrect old Password");
		            	}
		            	break;
		            case 5:
		            	return;
		            default:
		            	System.out.println("Enter Valid Choise!");
		            }
				}
			}
	
}
