package com.exception;

import java.util.Scanner;

public class Bank1App {

	public static void main(String[] args) {
		Bank1 b = new Bank1();
		b.banking();

	}

}

class Bank1 {
	void banking() {
		ATM1 a = new ATM1();

		try {
			a.acceptInfo();
			a.validate();
		} catch (InvalidInputException e) {
			System.out.println("Wrong credentials!!");
			System.out.println("Attemp 2");
			try {
				a.acceptInfo();
				a.validate();
			} catch (InvalidInputException e1) {
				System.out.println("Wrong credentials!!");
				System.out.println("Final Attempt");

				try {
					a.acceptInfo();
					a.validate();
				} catch (InvalidInputException e2) {
					System.out.println("Wrong credentials!!");
					System.out.println("Your ATM is Blocked for 24 Hours ");
				}
			}

		}

	}

}

class ATM1 {
	int accountNo = 123456;
	String passWord = "Abc123";
	int userAccount;
	String userPass;

	void acceptInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number");
		userAccount = sc.nextInt();
		System.out.println("Enter the Password");
		userPass = sc.next();
	}

	void validate() throws InvalidInputException {
		if (userAccount == accountNo && userPass.equals(passWord)) {
			System.out.println("Login Successfull");
		} else {
			InvalidInputException e = new InvalidInputException();
			System.out.println(e.getMessage());
			throw e;
		}
	}

}

class InvalidInputException extends Exception {
	public String getMessage() {
		return "Wrong Password";
	}
}