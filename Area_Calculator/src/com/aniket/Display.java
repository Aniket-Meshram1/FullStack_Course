package com.aniket;
import java.util.Scanner;
import com.entity.Circle;
import com.entity.Cone;
import com.entity.Cube;
import com.entity.Cylinder;
import com.entity.Parallelogram;
import com.entity.Rectangle;
import com.entity.Sphere;
import com.entity.Square;
import com.entity.Triangle;
import com.shape.Shape2D;
import com.shape.Shape3D;
import com.shape.Shapes;


public class Display {
public static void main(String[] args) {
		
		boolean choice = true;
		Scanner sc = new Scanner(System.in);	
		
		while(choice) {
		System.out.println("Select Shape Type ");
		System.out.println("1. 2D Shape");
		System.out.println("2. 3D Shape");
		int type = sc.nextInt();
		
		switch(type) {
		case 1:
			System.out.println("Select the shape to calculate the area : ");
			System.out.println("1. Circle");
			System.out.println("2. Square");
			System.out.println("3. Triangle");
			System.out.println("4. Rectangle");
			System.out.println("5. Parallelogram");
			int shape = sc.nextInt();
			
		
			switch(shape) {
			case 1 : 
				System.out.println("Enter the radius of Circle");
				float radius = sc.nextFloat();
				disp(new Circle(radius));
				break;
			case 2:
				System.out.println("Enter the side of Sqaure");
				float side  = sc.nextFloat();
				disp(new Square(side));
				break;
			case 3:
				System.out.println("Enter the base of Triangle");
				float base = sc.nextFloat();
				System.out.println("Enter the Height of traingle");
				float height = sc.nextFloat();
				disp(new Triangle(base, height));
				break;
			case 4:
				System.out.println("Enter the length of Rectangle");
				float length = sc .nextFloat();
				System.out.println("Enter the Breadth of Rectangle");
				float breadth = sc.nextFloat();
				disp(new Rectangle(length, breadth));
				break;
			case 5:
				System.out.println("Enter the base of Parallelogram");
				float b = sc.nextFloat();
				System.out.println("Enter the Height of Parallelogram");
				float h =sc.nextFloat();
				disp(new Parallelogram(b, h));
				break;
			default:
				System.out.println("Enter the valid choice!!");
				
			}
			break;
		case 2:
			System.out.println("Select the shape to calculate the area : ");
			System.out.println("1. Sphere");
			System.out.println("2. Cube");
			System.out.println("3. Cylinder");
			System.out.println("4. Cone");
			int shape1 = sc.nextInt();
			
			switch(shape1) {
			case 1 : 
				System.out.println("Enter the radius of Sphere");
				float radius = sc.nextFloat();
				disp3D(new Sphere(radius));
				break;
			case 2:
				System.out.println("Enter the side of Cube");
				float side  = sc.nextFloat();
				disp3D(new Cube(side));
				break;
			case 3:
				System.out.println("Enter the Radius of Cylinder");
				float r1 = sc.nextFloat();
				System.out.println("Enter the Height of Cylinder");
				float h1 = sc.nextFloat();
				disp3D(new Cylinder(r1, h1));
				break;
			case 4:
				System.out.println("Enter the Radius of Cone");
				float r2 = sc .nextFloat();
				System.out.println("Enter the Height of Cone");
				float h2 = sc.nextFloat();
				disp3D(new Cone(r2, h2));
				break;
			
			default:
				System.out.println("Enter the valid choice!!");
				break;
			
			}
			break;
		default:
			System.out.println("Enter The Valid Choice!!");
			break;
	
		}
		System.out.println("Do you want to calculate more !! (y/n)");
		String c = sc.next();
		choice = c.equals("y")?true:false;
		
		}
		
		System.out.println("💕💕 Visit Again 💕💕");
	

	}
	static void disp(Shape2D s) {
//		s.findArea();
		s.dispArea();
	}
	static void disp3D(Shape3D s) {
//		s.findSurfaceArea();
		s.dispArea();
	}
}
