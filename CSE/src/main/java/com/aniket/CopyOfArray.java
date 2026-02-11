package com.aniket;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5,6,};
		int [] b = new int[a.length];
//		b=Arrays.copyOf(a, a.length);
		
		for(int i = a.length-1 ,j=0; i >= 0&&j<a.length;i--,j++) {
			b[j]=a[i];		
		}
		for(int n: b) {
			System.out.println(n);
		}
	}

}
