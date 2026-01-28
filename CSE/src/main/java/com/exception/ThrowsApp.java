package com.exception;

import java.util.Scanner;

public class ThrowsApp {

	public static void main(String[] args) {
		System.out.println("Main connection established");
		Test4 t1 = new Test4();
		try{
			t1.gamma();
	}catch(Exception e) {
		System.out.println("Exception handled by main");
	}
		System.out.println("Main connectin terminated");
		
	}
}
class Test4 {
	void gamma()  throws Exception{
		System.out.println("Connection 3 established");
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter value 1");
		int a = sc.nextInt();
		System.out.println("Enter value 2");
		int b = sc.nextInt();
		
			int c = a/b;
			System.out.println(c);
		
	
		System.out.println("Connection 3 terminated");
	}
}