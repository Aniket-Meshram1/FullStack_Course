package com.package2;

import com.package1.DemoApp;

public class Demo3 {
	void disp() {
		DemoApp d = new DemoApp();
		System.out.println(d.a);
//		System.out.println(d.b);
//		System.out.println(d.c);
//		System.out.println(d.d);
	}

}
class Demo4 extends DemoApp{
	void disp() {
		
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
	}
	
	
}
