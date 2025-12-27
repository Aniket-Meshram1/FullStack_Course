package com.dsa;

public class AreaOfCircle {
	
	public static void main(String[] args) {
		
		Area a = new Area(5f);
		System.out.println("Area of circle : "+ a.disp());
		
		// TODO Auto-generated method stub

	}

}
class Area {
	final static float PI = 3.14f;
	float radius;
	float area;
	float pi;
	
	public Area(float radius) {
		this.radius = radius;
//		this.pi = pi;
	}
	public float disp() {
		area = PI*(radius*radius);
		return area;
	}
}