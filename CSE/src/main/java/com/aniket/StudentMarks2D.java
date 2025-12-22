package com.aniket;
import java.util.*;

public class StudentMarks2D {
	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers of Classes: ");
		int n = sc.nextInt();
		System.out.print("Enter the number of students in each :");
		int m  = sc.nextInt();
		int [][]marks = new int[n][m];
		
		for(int i = 0 ; i < marks.length;i++) {
			for(int j = 0 ; j<marks[i].length;j++) {
				System.out.println("Enter the marks of student "+(j+1)+" of class "+(i+1));
				marks[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < marks.length;i++) {
			for(int j = 0 ; j<marks[i].length;j++) {
				System.out.println("Marks of student "+(j+1)+" of class "+(i+1)+": "+marks[i][j]);
				
			}
		}
	sc.close();
	}

}
