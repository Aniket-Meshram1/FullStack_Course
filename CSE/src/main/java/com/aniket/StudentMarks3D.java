package com.aniket;

import java.util.Scanner;

public class StudentMarks3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Colleges: ");
		int m = sc.nextInt();
		System.out.print("Enter the no. of classes: ");
		int n = sc.nextInt();
		System.out.print("Enter the no. of Students: ");
		int s = sc.nextInt();
		int [][][] marks = new int[m][n][s];
		
		for(int i = 0 ; i<marks.length;i++) {
			for(int j = 0 ; j< marks[i].length;j++) {
				for(int k = 0 ; k <marks[i][j].length;k++) {
					System.out.print("Enter the Marks of student "+k+" of class "+j+" of college "+i+" :\n ");
					
					marks[i][j][k] = sc.nextInt();
				}
			}
		}
		
		for(int i = 0 ; i<marks.length;i++) {
			for(int j = 0 ; j< marks[i].length;j++) {
				for(int k = 0 ; k <marks[i][j].length;k++) {
					System.out.println("Marks of student "+k+" of class "+j+" of college "+i+" : "+ marks[i][j][k]);
					
					
				}
				System.out.println();
			}
		}
		
	}

}
