package com.aniket;
import java.util.*;


public class StudentName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Student: ");
		int size = sc.nextInt();
		
		String []names  = new String[size];
		for(int i = 0 ; i < names.length;i++) {
			System.out.print("Enter the Names of student "+(i+1)+":");
			names[i] = sc.next();
		}
		
		System.out.println();
		for(int n = 0 ; n < names.length;n++) {
			System.out.println("Names of Student "+(n+1)+": "+names[n]);
		
		}
		// TODO Auto-generated method stub

	}

}
