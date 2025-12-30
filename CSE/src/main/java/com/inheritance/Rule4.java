package com.inheritance;

public class Rule4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Child2 c  = new Child2();
	}

}

class Parent2{
	public Parent2(){
		
		System.out.println("Parent Constructor called");
		
	}
}
class Parent3{
	public Parent3(){
		System.out.println("Parent 3 Constructor");
	}
}

// Syntax Error 
// Multiple inheritance is not allowed in java due to ambiguity and diamond shape problem 
class Child2 extends Parent2 , Parent3{
	public Child2() {
		System.out.println("Child Constructor Called");
	}
	
}