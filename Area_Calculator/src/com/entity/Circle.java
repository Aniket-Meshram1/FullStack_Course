package com.entity;

import com.shape.Shape2D;


public class Circle implements Shape2D{
	private float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}
	public double findArea() {
		return PI*(radius*radius);
		
	}
	public void dispArea(){
		
		System.out.println("Area Of circle : "+findArea());
		}
}
