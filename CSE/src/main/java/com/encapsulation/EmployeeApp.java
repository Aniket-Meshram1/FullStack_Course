package com.encapsulation;

public class EmployeeApp extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "Aniket", 200000);
		System.out.println("Employee ID :"+e1.getId());
		System.out.println("Employee ID :"+e1.getName());
		System.out.println("Employee ID :"+e1.getSalary());
		

	}

}
class Employee extends Object{
	private int id;
	private String name;
	private int salary;
	public Employee(int id, String name, int salary) {
		super();  //super method used to call the Constructor of the Parent Class
		this.id = id;
		this.name = name;
		this.salary = salary;
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