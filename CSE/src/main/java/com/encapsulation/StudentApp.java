package com.encapsulation;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		System.out.print("Enter the Id of the Student :");
		int id = sc.nextInt();
	/* whenever you change input type like after int we are taking the String as input in that case 
		add sc.nextLine();
	*/	
		sc.nextLine();
	
	
		System.out.print("Enter the Name of Student :");
		String name = sc.nextLine();
		
		System.out.print("Enter the Marks of Student :");
		int marks = sc.nextInt();
		s1.setId(id);
		s1.setName(name);
		s1.setMarks(marks);
		System.out.println("Student ID :"+s1.getId());
		System.out.println("Student Name :"+s1.getName());
		System.out.println("Student marks :"+s1.getMarks());
		
		
		// TODO Auto-generated method stub

	}

}
 class Student{
	 private int id ; 
	 private String name;
	 private int marks;
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getMarks() {
		 return marks;
	 }
	 public void setMarks(int marks) {
		 this.marks = marks;
	 }
	 
 }