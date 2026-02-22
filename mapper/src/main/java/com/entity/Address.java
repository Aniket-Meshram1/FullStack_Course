package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int add_id;
	@Column
	String city;
	@Column 
	String street;
	public Address( String city, String street) {
		super();
	
		this.city = city;
		this.street = street;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return add_id;
	}
	public void setId(int id) {
		this.add_id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [id=" + add_id + ", city=" + city + ", street=" + street + "]";
	}
	
	
}
