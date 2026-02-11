package com.aniket;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []arr = {20,30,10,50,40};
			for(int i  = 0 ; i < arr.length;i++) {
				for(int j = 1; j < arr.length;j++) {
					if(arr[j-1]>arr[j]) {
						int temp = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(arr));
	}

}
