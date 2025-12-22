package com.aniket;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10,12,15,20,45,90};
		System.out.println("Enter the number to Search:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0 ;
		int idx = 0;
		boolean isPresent = false;
		int e = arr.length-1;
		while(e>=s) {
			int mid = ((e-s)/2)+s;
			if(arr[mid]==n) {
				idx = mid;
				isPresent = true;
				break;
			}
			else if(arr[mid]>n) {
				e = mid-1;
				
			}
			else {
				s = mid+1;
			}
		}
		if(isPresent) {
			System.out.println("Element found at index "+idx);
		}
		else {
			System.out.println("Element not found:(");
		}

	}

}
