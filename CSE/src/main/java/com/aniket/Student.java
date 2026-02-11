package com.aniket;

public class Student {
	public static void main(String [] args) {
		StudentDetails sd = new StudentDetails();
		sd.eat();
		 
	}

}
 class StudentDetails{
	String name;
	int age;
	String gender;
	void eat() {
		System.out.println("Student is entity");
	}
}