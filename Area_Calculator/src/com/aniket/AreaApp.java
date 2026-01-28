package com.aniket;

import java.util.Scanner;

public class AreaApp {

	public static void main(String[] args) {
		boolean choice = true;
		Scanner sc = new Scanner(System.in);	
		Area a = new Area();
		while(choice) {
			System.out.println("Select the shape to calculate the area : ");
		System.out.println("1. Circle");
		System.out.println("2. Square");
		System.out.println("3. Triangle");
		System.out.println("4. Rectangle");
		System.out.println("5. Parallelogram");
		int shape = sc.nextInt();
	
		
		switch(shape) {
		case 1 : 
			System.out.println("Enter the radius of Circle");
			float radius = sc.nextFloat();
			System.out.println("Area : "+a.AreaOfCircle(radius));
			break;
		case 2:
			System.out.println("Enter the side of Sqaure");
			float side  = sc.nextFloat();
			System.out.println("Area : "+a.AreaOfSquare(side));
			break;
		case 3:
			System.out.println("Enter the base of Triangle");
			float base = sc.nextFloat();
			System.out.println("Enter the Height of traingle");
			float height = sc.nextFloat();
			System.out.println("Area : "+a.AreaOfTriangle(base, height));
			break;
		case 4:
			System.out.println("Enter the length of Rectangle");
			float length = sc .nextFloat();
			System.out.println("Enter the Breadth of Rectangle");
			float breadth = sc.nextFloat();
			System.out.println("Area : "+a.AreaOfRectangle(length, breadth));
			break;
		case 5:
			System.out.println("Enter the base of Parallelogram");
			float b = sc.nextFloat();
			System.out.println("Enter the Height of Parallelogram");
			float h =sc.nextFloat();
			System.out.println("Area : "+a.AreaOfParallelogram(b, h));
			break;
		default:
			System.out.println("Enter the valid choice!!");
		}
		System.out.println("Do you want to calculate more !! (y/n)");
		String c = sc.next();
		choice = c.equals("y")?true:false;
		}
		
		System.out.println("💕💕 Visit Again 💕💕");
	}

}
