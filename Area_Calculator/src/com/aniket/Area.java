package com.aniket;

public class Area {
final public static float PI = 3.14f;
public float AreaOfCircle(float radius) {
	return PI*(radius*radius);
}
public float AreaOfTriangle(float base,float height) {
	return 0.5f*(base*height);
}
public float AreaOfRectangle(float length,float breadth) {
	return length*breadth;
}
public float AreaOfSquare(float side) {
	return side*side;
}
public float AreaOfParallelogram(float base ,float height) {
	return base*height;
}
}

