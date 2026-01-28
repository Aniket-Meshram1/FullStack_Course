package com.entity;

import com.shape.Shape3D;

public class Cube implements Shape3D{
	private float side;

	public Cube(float side) {
		super();
		this.side = side;
	}

	public double findSurfaceArea() {
		return 6 * (side * side);
	}
	
	public void dispArea() {
		System.out.println("Surface Area Of a Cube : "+findSurfaceArea());
	}
}
