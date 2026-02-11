package com.polymorphism;

public class TendulakarApp {

	public static void main(String[] args) {
		Tendulakar t = new ArjunTendulakar();
		t.job();
		t.profession();
//		t.smoke();  smoke is not accessible by parent class reference because it is specialized method in child class only
		
		
		((ArjunTendulakar)t).smoke(); // we can access the specialized method of child class by downcasting means converting parent type to child type

	}

}
class Tendulakar{
	void job() {
		System.out.println("Plays Cricket");
	}
	void profession() {
		System.out.println("He is a Batsman");
	}
}
class ArjunTendulakar extends Tendulakar{
	void profession() {
		System.out.println("He is a Bowller");
	}
	void smoke() {
		System.out.println("He is Smoker");
	}
}