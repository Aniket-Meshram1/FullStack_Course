package com.abstraction;

public class Rule1 {

	public static void main(String[] args) {
//	Bird b = new Bird();
//	Rule 1.	we are not able to create the object of the abstract class 
	}
}
// Rule 2 an abstract class may contain and may not contain the abstract method
abstract class Bird{
	abstract void eat();
	abstract void fly();
	void sleep() {
		System.out.println("Sleep");
	}
}

//Rule3 A child class must override all the abstract method present in the parent class 

// Rule 4 if a class partially implements the method of an abstract class so the child class should also be the abstract class
abstract class Sparrow extends Bird{
	void eat() {
		System.out.println("Eat ");
	}
}

class VegSparrow extends Sparrow{
	void fly() {
		System.out.println("it can fly");
		
	}
	
}


//  an abstract class can contains all the component that can present in normal class it can also contains the constructor
abstract class Component{
	static int a ;
	static {
		a = 0;
	}
	static void disp() {
		System.out.println(a);
		
	}
	int b;
	{
		b =20;
	}
	void disp1() {
		System.out.println(b);
	}
}