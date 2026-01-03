package com.inheritance;

public class OverriddingApp {

	public static void main(String[] args) {
		P1 p = new P1();
		p.disp();
		C1 c = new C1();
		c.disp();
		P1 c2 = new C1();
		c2.disp();

	}

}
class P1{
	void disp() {
		System.out.println("Parent");
	}
}
class C1 extends P1{
	void disp() {
		System.out.println("Child");
	}
}