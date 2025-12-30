package com.inheritance;

public class Rule1 {

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.a);
		System.out.println("-----------------");
		c.disp();

	}

}
class Parent{
	int a = 10 ;
	int b = 20;
	void disp() {
		System.out.println(a +"\n"+b);
	}
}
class Child extends Parent{
	
}