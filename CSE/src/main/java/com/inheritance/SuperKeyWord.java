package com.inheritance;

public class SuperKeyWord {

	public static void main(String[] args) {
		Chil c = new Chil();
		c.disp();

	}

}
class Paren {
	int x = 10;
	void disp() {
		System.out.println(x);
	}
}
class Chil extends Paren{
	int x =20 ;
	void disp() {
		System.out.println(x);
		System.out.println(super.x);
	}
}