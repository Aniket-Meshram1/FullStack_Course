package com.entity;

import com.shape.Shape3D;

public class Cylinder implements Shape3D{
	private float radius;
	private float height;
	public Cylinder(float radius, float height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	public double findSurfaceArea() {
		return 2 * PI * radius * (radius + height);
	}
	public void dispArea() {
		System.out.println("Total Surface Area of Cylonder : "+findSurfaceArea());
	}

}
