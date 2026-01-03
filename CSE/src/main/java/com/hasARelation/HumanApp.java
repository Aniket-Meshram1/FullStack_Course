package com.hasARelation;

public class HumanApp {

	public static void main(String[] args) {
		Student2 s = new Student2();
		Bike2 b= new Bike2("Honda", 150000, "Black") ;
		Book2 b1 = new Book2("ABC", 500);
		
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
class Human{
	Heart2 h = new Heart2("Pump", 500);
	Brain2 br = new Brain2(100, 800);
}
class Heart2 {
	String job;
	int weight;
	public Heart2(String job, int weight) {
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
class Brain2{
	int iq;
	int weight;
	public Brain2(int iq, int weight) {
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
class Student2 extends Human{
	void hasABike(Bike2 b) {
		System.out.println("Bike Brand : "+b.getBrand());
		System.out.println("BIke Color : "+b.getColour());
		System.out.println("Bike price : "+b.getPrice());
		
	}
	void hasABook(Book2 b) {
		System.out.println("Bokke title : "+b.getTitle());
		System.out.println("Book Price : "+b.getPrice());
	}

}
class Book2{
	String title;
	int price;
	public Book2(String title, int price) {
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
class Bike2{
	String brand;
	int price;
	String colour;
	public Bike2(String brand, int price, String colour) {
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