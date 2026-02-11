package com.dsa;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int [] arr = {1,2,4,5,6,8,7};
		int n = arr.length-1;
		int [] rev = new int[n];
		for(int i = n ,j = 0; i>=0 && j < n;i--,j++) {
			rev[j] = arr[i];
		}
		System.out.println(Arrays.toString(rev));
	}

}
