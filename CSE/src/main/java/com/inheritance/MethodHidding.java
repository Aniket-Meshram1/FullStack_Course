package com.inheritance;

public class MethodHidding {

	public static void main(String[] args) {
		P2 p = new P2();
		p.disp();
		C2 c = new C2();
		c.disp();
		P2 c2 = new C2();
		c2.disp();

	}

}
// when the both parent and child method are static then method call is depend on the reference
class P2{
	static void disp() {
		System.out.println("Parent");
	}
}
class C2 extends P2{
	static void disp() {
		System.out.println("Child");
	}
}