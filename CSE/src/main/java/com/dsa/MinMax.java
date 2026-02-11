package com.dsa;

public class MinMax {

	public static void main(String[] args) {
		
		int []arr = {19,5,7,1,2,4,6,3,8,2};
		System.out.println("Minimum Value : "+min(arr));
		System.out.println("MAximum Value : "+ max(arr));
		
	}
	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int n : arr) {
			if(n<min) {
				min = n;
			}
		}
		return min;
		
	}
	
	public static int max(int []arr) {
		int max= Integer.MIN_VALUE;
		for(int n: arr) {
			if(n>max) {
				max = n;
			}
		}
		return max;
	}

}
