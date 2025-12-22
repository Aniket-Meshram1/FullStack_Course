package com.aniket;

import java.util.Scanner;

public class SearchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {25,14,85,68,24,97,12};
		int i ;
		System.out.println("Enter the Element to search in Array: ");
		Scanner sc = new Scanner(System.in);
		boolean isPresent = false;
		int a= sc.nextInt();
		for( i = 0 ; i  < arr.length;i++) {
			if(arr[i]==a) {
				isPresent = true;
				break;
			}
		}
		if(isPresent) {
			System.out.println("Element "+a+" present at index "+i);
		}
		else {
			System.out.println("Element not found in Array");
		}
		sc.close();
	}

}
