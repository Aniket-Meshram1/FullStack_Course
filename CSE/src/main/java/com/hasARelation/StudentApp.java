package com.hasARelation;

public class StudentApp {

	public static void main(String[] args) {
		Student s = new Student();
		s = null;
		Bike b = new Bike("Yamha", 270000, "Black");
//		s.hasA(b);
		System.out.println("-----------------------");
//		System.out.println(s.h.getJob());
//		System.out.println(s.h.getWeight());
		System.out.println(b.getBrand());
		System.out.println(b.getColour());
		System.out.println(b.getPrice());
	}

}
class Student {
	Heart h = new Heart("Intern",78);
	void hasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		System.out.println(b.getColour());;
	}
	
}
class Heart{
	String job;
	int weight;
	public Heart(String job, int weight) {
		super();
		this.job = job;
		this.weight = weight;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
class Bike{
	String brand;
	int price;
	String colour;
	public Bike(String brand, int price, String colour) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColour() {
		return colour;
	}
	
}