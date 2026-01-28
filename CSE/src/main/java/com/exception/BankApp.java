package com.exception;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.banking();

	}

}
class Bank{
	void banking() {
		System.out.println("Bank connection established");
		ATM atm = new ATM();
		try {
			atm.transaction();
		} catch (Exception e) {
			System.out.println("info recieved by the bank your money will be refunded in 24 hours");
		}
		System.out.println("Bank connection closed");
	}

}
class ATM  {
	void transaction() throws Exception {
		System.out.println("ATM Connection established");
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter value 1");
		int a = sc.nextInt();
		System.out.println("Enter value 2");
		int b = sc.nextInt();
		try {
			int c = a/b;
			System.out.println(c);
		}catch (Exception e) {
		System.out.println("Exception Handled by ATM");
		throw e;
		}finally {
			System.out.println("ATM Connection terminated"); 
		}
	}
}