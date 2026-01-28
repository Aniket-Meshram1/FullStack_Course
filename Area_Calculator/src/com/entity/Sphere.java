package com.entity;

import com.shape.Shape3D;

public class Sphere implements Shape3D{
	private float radius;

	public Sphere(float radius) {
		super();
		this.radius = radius;
	}
	public double findSurfaceArea() {
		return 4 * PI *(radius * radius);
	}
	public void dispArea() {
		System.out.println("Surface area of a Sphere : "+ findSurfaceArea());
	}
}
