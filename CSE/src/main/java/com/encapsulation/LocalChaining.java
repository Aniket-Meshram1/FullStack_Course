package com.encapsulation;

public class LocalChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp();

	}

}
class Emp {
	int id;
	String name;
	int salary;
	public Emp() {
		this(101,"Aniket",20000);
		System.out.println("0 Parameterized Called");
	}
	public Emp(int id) {
		System.out.println("1 Parameterized Called");
	}
	public Emp(int id,String name) {
		this(101);
		System.out.println("2 Parameterized Called");
	}
	public Emp(int id,String name,int Salary) {
		this(101,"Aniket");
		System.out.println("3 Parameterized called");
	}
}
