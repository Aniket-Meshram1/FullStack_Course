package com.aniket;
import java.util.*;
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Student: ");
		int size = sc.nextInt();
		int []marks  = new int[size];
		for(int i = 0 ; i < marks.length;i++) {
			System.out.print("Enter the marks of student "+(i+1)+":");
			marks[i] = sc.nextInt();
		}
		System.out.println();
		for(int n = 0 ; n < marks.length;n++) {
			System.out.println("Marks of Student "+(n+1)+": "+marks[n]);
		
		}
	}

}
