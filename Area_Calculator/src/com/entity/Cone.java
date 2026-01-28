package com.entity;

import com.shape.Shape3D;

public class Cone implements Shape3D{
	private float radius;
	private float length;
	public Cone(float radius, float length) {
		super();
		this.radius = radius;
		this.length = length;
	}
	
public double findSurfaceArea() {
	return PI * radius*(radius+length);
}
public void dispArea() {
	System.out.println("Total Surface Area of Cone : "+findSurfaceArea());
}
}
