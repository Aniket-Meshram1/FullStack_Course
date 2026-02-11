package com.inheritance;

public class Rule3 {

	public static void main(String[] args) {
		// here parent constructor is not accessible but it being called due to constructor chaining i.e due to super() method

		Child1 c  = new Child1();

	}

}
class Parent1{
	public Parent1(){
		
		System.out.println("Parent Constructor called");
		
	}
}
class Child1 extends Parent1{
	public Child1() {
		System.out.println("Child Constructor Called");
	}
	
}