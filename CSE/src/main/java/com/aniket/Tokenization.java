package com.aniket;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Tokenization {

	public static void main(String[] args) {
		int count = 0;
		String s = "Department of Computer Science and Engineering";
		StringTokenizer st = new StringTokenizer(s," ");
//		Scanner sc = new Scanner(s);
		
//		
//		while(st.hasMoreTokens()) {
//			
//			st.nextToken();
//			count++;
//		}
//		
//		System.out.println(count);
//		
//		
		
//		this is to print the String in Completely reverse order
		
		char [] ch1 = s.toCharArray();
	for(int i = ch1.length-1 ;i>=0; i--) {
		System.out.print(ch1[i]);
		
	}
		System.out.println();
//		
//		
	while(st.hasMoreTokens()) {
		String temp = st.nextToken();
	char ch2 [] = temp.toCharArray();
	for(int i = ch2.length-1 ;i>=0; i--) {
		System.out.print(ch2[i]);
	
	}
	System.out.print(" ");
	}
	System.out.println();
		
		String [] ch = s.split(" ");
		for(int i = ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+" ");
			
		}
		
		
		


	}

}
