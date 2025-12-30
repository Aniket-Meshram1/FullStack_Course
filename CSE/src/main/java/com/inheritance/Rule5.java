package com.inheritance;

public class Rule5 {

	public static void main(String[] args) {
		Childs s = new Childs();
		System.out.println(s.a);
		System.out.println(s.b);

	}

}
class GrandParent{
	int a = 10;
}
class Parents extends GrandParent{
	int b = 20;
}
class Childs extends Parents{
	
}