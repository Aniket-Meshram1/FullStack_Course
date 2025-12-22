package com.aniket;

import java.util.Scanner;

public class Jagged2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers of Classes: ");
		int n = sc.nextInt();
//		System.out.print("Enter the number of students in each :");
//		int m  = sc.nextInt();
		int [][]marks = new int[n][];
		for(int i =0 ; i <marks.length;i++ ) {
			System.out.println("Enter the total number of student in class "+i);
			marks[i] = new int[sc.nextInt()]; 
		}
		
		for(int i = 0 ; i < marks.length;i++) {
			for(int j = 0 ; j<marks[i].length;j++) {
				System.out.println("Enter the marks of student "+(j+1)+" of class "+(i+1));
				marks[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < marks.length;i++) {
			for(int j = 0 ; j<marks[i].length;j++) {
				System.out.print(marks[i][j]+ " ");
//				System.out.println("Marks of student "+(j+1)+" of class "+(i+1)+": "+marks[i][j]);
				
			}
			System.out.println();
		}
	sc.close();

	}

}
