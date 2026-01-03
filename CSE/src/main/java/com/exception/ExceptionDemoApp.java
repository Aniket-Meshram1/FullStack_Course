package com.exception;

import java.util.Scanner;

public class ExceptionDemoApp {

	public static void main(String[] args) {
		System.out.println("Connection Established");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value 1");
		int a = sc.nextInt();
		System.out.println("Enter the value 2");
		int b = sc.nextInt();
		try {
		int c = a/b;
		System.out.println(c);
		System.out.println("Enetr the size of array");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the index  ");
		int idx = sc.nextInt();
		arr[idx] = 10;
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Enter the index within range");
		}
		catch (NegativeArraySizeException e) {
			
			System.out.println("Enter the Positive size of array");
		}catch (ArithmeticException e) {
			
			System.out.println("can not divide by zero!!!!");
		}
		System.out.println("Connection Closed");
		sc.close();
	}

}
