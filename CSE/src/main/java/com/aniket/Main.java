package com.aniket;

public class Main {
	public static void main(String []args) {
	Robot r1 = new Robot();
	r1.brand = "Victus";
	r1.os = "Windows";
	r1.microprocessor = "ryzen";
	System.out.println("Brand : "+ r1.brand +"\nOS : "+r1.os+"\nMicroprocessor :"+r1.microprocessor);
	
	r1.move();
	r1.run();
	
	
	Robot r2 = new Robot();
	System.out.println(r2);
	r2.brand ="Dell";
	r2.os= "Linux";
	r2.microprocessor= "Intel";
	System.out.println("\n\nBrand : "+ r2.brand +"\nOS : "+r2.os+"\nMicroprocessor :"+r2.microprocessor);
	r2.move();
	r2.run();
	
	}
}
 

