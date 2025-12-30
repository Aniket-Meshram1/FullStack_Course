package com.inheritance;

public class Rule2 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.a); //  due to private field a it is not accessible in main class 
		System.out.println(c.b);
		System.out.println("-----------------");
		c.disp(); // due to private field it is not accessible in main class 

	}

}
class Parent{
	 private int a = 10 ;
	 int b = 20;
	private void disp() {
		System.out.println(a +"\n"+b);
	}
}
class Child extends Parent{
	
}