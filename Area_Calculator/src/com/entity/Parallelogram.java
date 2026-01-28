package com.entity;

import com.shape.*;

public class Parallelogram implements Shape2D{
private float base;
private float height;
public Parallelogram(float base, float height) {
	super();
	this.base = base;
	this.height = height;
}
 public double findArea() {
	return base*height;
}
 	public void dispArea() {
	System.out.println("Area Of Parallelogram : "+findArea());
}
}
