package com.dsa;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		if(isPallindrom(str)) {
			System.out.println("The Given String is Pallindrom");
		}else {
			System.out.println("The Given String is not Pallindrom");
		}
	
	}
	
	public static boolean isPallindrom(String str ) {
		str = str.toLowerCase();
		int i = 0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
