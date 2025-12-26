package com.aniket;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.add(10, 20,30));
		System.out.println(calc.add(10.5f, 20));
		
		// TODO Auto-generated method stub

	}

}



//------Method Overloading Example------

class Calculator{
	int add (int a , int b) {
		return a+b;
	}
	int add (int a , int b,int c) {
		return a+b+c;
	}
	float add (float a , int b) {
		return a+b;
	}
	float add (float a , float b) {
		return a+b;
	}
	float add (float a , int b,float c) {
		return a+b+c;
	}
}