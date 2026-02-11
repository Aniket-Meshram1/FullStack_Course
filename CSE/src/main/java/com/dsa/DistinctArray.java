package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class DistinctArray {

	public static void main(String[] args) {
		int [] arr = {1,2,5,5,8,7,7,9,6,2,2,9,1};
		System.out.println(distinct(arr));
		

	}
	
	public  static ArrayList<Integer> distinct (int [] arr) {
	Arrays.sort(arr);
	ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i = 0 ; i < arr.length-1 ;i++) {
		if(arr[i]!= arr[i+1]) {
			list.add(arr[i]);
		}
		
	}
	return list;
	
	
	}

}
