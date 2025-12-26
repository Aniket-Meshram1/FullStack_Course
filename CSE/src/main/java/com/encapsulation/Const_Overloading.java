package com.encapsulation;

public class Const_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1(101, "Aniket", 200000);
		System.out.println("Employee ID :"+e1.getId());
		System.out.println("Employee ID :"+e1.getName());
		System.out.println("Employee ID :"+e1.getSalary());
		
		Employee1 e2 = new Employee1();
		System.out.println("Employee ID :"+e2.getId());
		System.out.println("Employee ID :"+e2.getName());
		System.out.println("Employee ID :"+e2.getSalary());

	}

}

class Employee1 {
	private int id;
	private String name;
	private int salary;
	public Employee1(int id, String name, int salary) {
		super();  //super method used to call the Constructor of the Parent Class
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee1() {
	//	this(101, "Aniket", 200000);  // this method refers to the constructor of the current class here it is parameterized constructor
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
}