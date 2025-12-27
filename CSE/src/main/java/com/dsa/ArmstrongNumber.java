package com.dsa;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		String n =String.valueOf(num);
		int power = n.length();
//		int n1 = Integer.parseInt(n);
//		System.out.println(n1);
		int res = 0;
		for(char ch : n.toCharArray()) {
			int temp = ch -'0';
			res += Math.pow(temp, power);
		}
		if(num == res) {
			System.out.println(num+" is a Armstrong Number:)");
		}else {
			System.out.println(num+" is not a Armstrong number:(");
		}
	}

}
