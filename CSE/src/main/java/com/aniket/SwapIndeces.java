package com.aniket;

import java.util.Arrays;
import java.util.Scanner;

public class SwapIndeces {
	public static void main(String[] args) {
		int []arr = {11,12,13,14,15,16};
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the first index : (0 to "+(arr.length-1)+" )");
		int idx1 = sc.nextInt();
		System.out.println("Enter the Second index : (0 to " +(arr.length-1)+ " )" );
		int idx2 = sc.nextInt();
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		System.out.println(Arrays.toString(arr));
		
		
	}

}
