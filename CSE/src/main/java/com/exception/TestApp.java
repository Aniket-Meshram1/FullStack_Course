package com.exception;

import java.util.Scanner;



public class TestApp {

	public static void main(String[] args) {
		System.out.println("Main connection established");
		Test1 t1 = new Test1();
		t1.alpha();
		System.out.println("Main connectin terminated");
	}

}
class Test1{
	void alpha() {
		System.out.println("Connection 1 established");
		Test2 t2 = new Test2();
		t2.beta();
		System.out.println("Connection 1 terminated");
	}
}
class Test2 {
	void beta() {
		System.out.println("Connection 2 established");
		Test3 t3 = new Test3();
		t3.gamma();
		System.out.println("Connection 2 Terminated");
	}
}
class Test3 {
	void gamma() {
		System.out.println("Connection 3 established");
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter value 1");
		int a = sc.nextInt();
		System.out.println("Enter value 2");
		int b = sc.nextInt();
		try {
			int c = a/b;
			System.out.println(c);
		}catch (Exception e) {
		System.out.println("Exception Handled by gamma");
		}
	
		System.out.println("Connection 3 terminated");
	}
}