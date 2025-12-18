package com.aniket;

public class FanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f1 = new Fan();
		System.out.println("Before Assigning Values");
		System.out.println(f1.brand+"\n"+f1.price+"\n"+f1.colour);
		f1.brand = "Bajaj";
		f1.price = 2100;
		f1.colour = "White";
		System.out.println("\nAfter Assigning Values");
		
		System.out.println(f1.brand+"\n"+f1.price+"\n"+f1.colour+"\n");
		Fan f2 = new Fan();
		System.out.println("Before Assigning Values");
		System.out.println(f2.brand+"\n"+f2.price+"\n"+f2.colour+"\n");
		f2.brand = "Havels";
		f2.price = 2500;
		f2.colour = "Brown";
		System.out.println("\nAfter Assigning Values");
		System.out.println(f2.brand+"\n"+f2.price+"\n"+f2.colour);

	}

}
class Fan{
	String brand;
	int price;
	String colour;
	
}
