package com.aniket;

import java.util.Scanner;

public class Jagged3D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Colleges: ");
		int m = sc.nextInt();
		int [][][] marks = new int[m][][];
		for(int i = 0 ; i < marks.length ; i++) {
		System.out.println("Enter the no. of classes in college "+(i+1));
		marks[i] = new int[sc.nextInt()][];
		for(int j = 0 ; j < marks[i].length ; j++) {
			System.out.println("Enter the no. of Sturdent in class "+(j+1));
			marks[i][j] = new int[sc.nextInt()];
			}
		}
		
		
		for(int i = 0 ; i<marks.length;i++) {
			for(int j = 0 ; j< marks[i].length;j++) {
				for(int k = 0 ; k <marks[i][j].length;k++) {
					System.out.print("Enter the Marks of student "+(k+1)+" of class "+(j+1)+" of college "+(i+1)+" :\n ");
					
					marks[i][j][k] = sc.nextInt();
				}
			}
		}
		
		for(int i = 0 ; i<marks.length;i++) {
			for(int j = 0 ; j< marks[i].length;j++) {
				for(int k = 0 ; k <marks[i][j].length;k++) {
					System.out.println("Marks of student "+(k+1)+" of class "+(j+1)+" of college "+(i+1)+" : "+ marks[i][j][k]);
					
					
				}
				System.out.println();
			}
		}
		
	}

}
