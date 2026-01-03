package com.hasARelation;

public class StudentApp1 {

	public static void main(String[] args) {
		Student1 s = new Student1();
		Bike1 b= new Bike1("Honda", 150000, "Black") ;
		Book1 b1 = new Book1("ABC", 500);
		
		s.hasABike(b);
		System.out.println("----------------------");
		s.hasABook(b1);
		System.out.println("----------------------");
		System.out.println("Brain Iq :"+s.br.getIq());
		System.out.println("Brain weight : "+s.br.getWeight());
		System.out.println("----------------------");
		System.out.println("Heart Job : "+ s.h.getJob());
		System.out.println("Hearth Weight : "+ s.h.getWeight());

	}

}
class Student1 {
	
	Heart1 h = new Heart1("Pump", 500);
	Brain1 br = new Brain1(100, 800);
	void hasABike(Bike1 b) {
		System.out.println("Bike Brand : "+b.getBrand());
		System.out.println("BIke Color : "+b.getColour());
		System.out.println("Bike price : "+b.getPrice());
		
	}
	void hasABook(Book1 b) {
		System.out.println("Bokke title : "+b.getTitle());
		System.out.println("Book Price : "+b.getPrice());
	}

}
class Heart1{
	String job;
	int weight;
	public Heart1(String job, int weight) {
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
class Bike1{
	String brand;
	int price;
	String colour;
	public Bike1(String brand, int price, String colour) {
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
class Book1{
	String title;
	int price;
	public Book1(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	
}
class Brain1{
	int iq;
	int weight;
	public Brain1(int iq, int weight) {
		super();
		this.iq = iq;
		this.weight = weight;
	}
	public int getIq() {
		return iq;
	}
	public int getWeight() {
		return weight;
	}
	
}
