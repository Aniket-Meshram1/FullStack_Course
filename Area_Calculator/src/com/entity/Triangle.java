package com.entity;

import com.shape.Shape2D;


public class Triangle implements Shape2D{
	private float base;
	private float height;
	public Triangle(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double findArea() {
		return half * base*height;
	}
	public void dispArea() {
		System.out.println("Area Of Triangle : "+findArea());
	}
	
}