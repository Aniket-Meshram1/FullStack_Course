package com.dsa;

public class MissingNum {

	public static void main(String[] args) {
		int [] arr = {1,2,5,4,6,7};
		System.out.println("Missing Number : "+missNum(arr));

	}
	public static int missNum(int[] arr) {
		int n = arr.length+1;
		int totalsum = n * (n+1)/2;
		int sum = 0;
		
		for(int i: arr) {
			sum+=i;
		}
		return totalsum -sum;
		
	}

}
