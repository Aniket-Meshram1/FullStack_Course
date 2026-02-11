package com.dsa;

import java.util.Scanner;

public class AreaOfTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base Of Triangle");
		float base = sc.nextFloat();
		System.out.println("Enter the Height Of Triangle");
		float height = sc.nextFloat();
		Triangle t1 = new Triangle(base,height);
		System.out.println("Area of Triangle : "+t1.disp());
		

	}

}
class Triangle{
	float base , height;
	float area;
	public Triangle(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}
	public float disp() {
		area = 0.5f*(base*height);
		return area;
	}
}