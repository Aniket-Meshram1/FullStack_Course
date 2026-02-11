package com.inheritance;

public class ConstructorChaining {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.a+" "+c.b);

	}

}
class P{
	int a ;
	int b ;
	public P() {
		a = 10;
		b = 20;
	}
	public P(int a ,int b) {
		this.a = a;
		this.b = b;
	}
}
class C extends P{
	public C () {
		a = 30;
		b = 40;
	}
	public C(int a , int b) {
		this.a = a;
		this.b = b;
	}
}