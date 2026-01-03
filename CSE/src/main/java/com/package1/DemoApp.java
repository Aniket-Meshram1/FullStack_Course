package com.package1;

public class DemoApp {
	
	public int a; //Public is Accessible from anywhere inside Same project
	protected int b; // Protected is Accessible in the same package as well as child class of Different package
	int c;			// Default is Accessible within the same Package only
	private int d; // Private is accessible within the same class only

	public static void main(String[] args) {
		
			DemoApp d = new DemoApp();
			System.out.println(d.a);
			System.out.println(d.b);
			System.out.println(d.c);
			System.out.println(d.d);
		
	
	}

}
class Demo1{
	void disp() {
		DemoApp d = new DemoApp();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
//		System.out.println(d.d);
	}
}
class Demo2 extends DemoApp{
	void disp() {
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
//		System.out.println(d);
	}
	
}