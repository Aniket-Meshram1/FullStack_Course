package com.aniket;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Tokenization {

	public static void main(String[] args) {
		int count = 0;
		String s = "Department of Computer Science and Engineering";
		StringTokenizer st = new StringTokenizer(s," ");
		Scanner sc = new Scanner(s);
//		while(st.hasMoreTokens()) {
//			
//			st.nextToken();
//			count++;
//		}
		// TODO Auto-generated method stub
		System.out.println(count);
//		
//		char [] ch = s.toCharArray();
//	for(int i = ch.length-1 ;i>=0; i--) {
//		System.out.print(ch[i]);
//		
//	}
		
//		
//		
//	while(st.hasMoreTokens()) {
//		String temp = st.nextToken();
//	char ch1 [] = temp.toCharArray();
//	for(int i = ch1.length-1 ;i>=0; i--) {
//		System.out.print(ch1[i]);
//	
//	}
//	System.out.print(" ");
//	}
		
		String [] ch = s.split(" ");
		for(int i = ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+" ");
			
		}
		
		
		


	}

}
