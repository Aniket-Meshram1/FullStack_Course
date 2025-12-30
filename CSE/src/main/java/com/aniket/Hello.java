package com.aniket;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Hello !!!");
Hello.main();
Hello.main('c');
Hello.main(new int []{1,2,3});;
	}

	public static void main(int []args) {
		System.out.println("int called");
	}
	
	public static void main() {
		System.out.println("No Arguments");
	}
	public static void main(char c) {
		System.out.println("Char called");
	}
}
