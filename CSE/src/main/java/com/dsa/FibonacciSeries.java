package com.dsa;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fibonacci Number to find searies : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		if (n == 0) {
			System.out.print(a + " ");
		} else {

			System.out.print(a + " ");
			System.out.print(b + " ");
			for (int i = 2; i < n; i++) {

				int fib = a + b;
				a = b;
				b = fib;
				System.out.print(fib + " ");
			}

		}

	}
}
