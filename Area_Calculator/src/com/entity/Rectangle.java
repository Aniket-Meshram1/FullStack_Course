package com.entity;

import com.shape.Shape2D;

public class Rectangle implements Shape2D{
	private float length;
	private float breadth;
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public double findArea() {
		return length*breadth;
	}
	public void dispArea() {
		System.out.println("Area Of Rectangle : "+findArea());
	}

}
