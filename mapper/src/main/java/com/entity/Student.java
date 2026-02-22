package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int s_id;
	@Column
	String name;
	@Column
	String email;
	@Column
	String phone;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "add_id", referencedColumnName = "add_id")
	Address address;
	
	public Student() {
		super();
		
	}

	public Student(  String name, String email, String phone,Address address) {
		super();
		
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public int getId() {

		return s_id;
	}

	public void setId(int id) {
		this.s_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + "]";
	}

}
