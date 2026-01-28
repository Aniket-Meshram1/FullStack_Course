package com.entity;

import com.shape.Shape2D;


public class Square implements Shape2D{
	private float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	public float getSide() {
		return side;
	}
	public double findArea() {
		return side * side;
	}
	public void dispArea() {
		System.out.println("Area Of Square : "+findArea());
	}
}