package com.hasARelation;

public class LaptopApp {
	public static void main(String [] args) {
	Laptop lp = new Laptop();
	
	Charger c = new Charger("HP",150);
	System.out.println(lp.os.getBrand());
	System.out.println(lp.os.getVersion());
	System.out.println("----------------");
		lp.hasA(c);
	
}
}
class Os{
	private String brand;
	private String version;
	public Os(String brand, String version) {
		super();
		this.brand = brand;
		this.version = version;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}

class Charger{
	private String brand;
	private int power;
	public Charger(String brand, int power) {
		super();
		this.brand = brand;
		this.power = power;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
}
class Laptop{
	Os os = new Os("Windows","10.2");
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getPower());
	}
}