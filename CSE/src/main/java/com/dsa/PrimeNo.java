package com.dsa;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		if(isPrime(num)) {
			System.out.println(num+" is A Prime number.");
		}else {
			System.out.println(num+" is not a Prime number.");
		}
	}

	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i = 2 ;i < n/2 ; i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
	}
}
