package com.abstraction;

import java.util.Scanner;


public class AreaApp {

	public static void main(String[] args) {
		
		boolean choice = true;
		Scanner sc = new Scanner(System.in);	
		
		while(choice) {
		System.out.println("Select the shape to calculate the area : ");
		System.out.println("1. Circle");
		System.out.println("2. Square");
		System.out.println("3. Triangle");
	
		int shape = sc.nextInt();
		switch(shape) {
		case 1 : 
			System.out.println("Enter the radius of Circle");
			float radius = sc.nextFloat();
			disp(new Circle(radius));
			break;
		case 2:
			System.out.println("Enter the side of Sqaure");
			float side  = sc.nextFloat();
			disp(new Square(side));
			break;
		case 3:
			System.out.println("Enter the base of Triangle");
			float base = sc.nextFloat();
			System.out.println("Enter the Height of traingle");
			float height = sc.nextFloat();
			disp(new Triangle(base, height));
			break;
		default:
			System.out.println("Enter the valid choice!!");
		}
		System.out.println("Do you want to calculate more !! (y/n)");
		String c = sc.next();
		choice = c.equals("y")?true:false;
		}
		
		System.out.println("💕💕 Visit Again 💕💕");
	

	}
	static void disp(Shapes s) {
		s.findArea();
		s.dispArea();
	}

}
abstract class Shapes{
	static final float PI = 3.14f;
	double area ;
	
	static float half = 0.5f;
	abstract void findArea();
	abstract void dispArea();
}
class Circle extends Shapes{
	private float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}
	void findArea() {
		area= PI*(radius*radius);
		
	}
	void dispArea(){
		
		System.out.println("Area Of circle : "+area);
		}
}
class Square extends Shapes{
	private float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	public float getSide() {
		return side;
	}
	void findArea() {
		area = side * side;
	}
	void dispArea() {
		System.out.println("Area Of Square : "+area);
	}
}
class Triangle extends Shapes{
	private float base;
	private float height;
	public Triangle(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}
	public float getBase() {
		return base;
	}
	public float getHeight() {
		return height;
	}
	void findArea() {
		area =  half * base*height;
	}
	void dispArea() {
		System.out.println("Area Of Triangle : "+area);
	}
	
}