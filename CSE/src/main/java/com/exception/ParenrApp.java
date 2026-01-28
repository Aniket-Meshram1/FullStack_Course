package com.exception;

import java.sql.SQLException;

public class ParenrApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp();

	}
	
	static void disp() {
		System.out.println("Hello !!!!");
		disp();
	}

}
//overridden child method should throws the same exception as parent method or should not throws the any exception
class Parent{
	void disp() throws SQLException{
		
	}
	void d () throws RuntimeException{
		
	}
}
class Child extends Parent{
//	void disp() {
//		
//	}
	void disp() throws SQLException{
		
	}
	// here d in parent class have runtime exception and d in child class have arithmeric exception which child of runtime so it is allowed
	void d() throws ArithmeticException{
		
	}
}