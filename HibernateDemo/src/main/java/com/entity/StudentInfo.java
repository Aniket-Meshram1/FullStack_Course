package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentInfo {
	@Id
	int roll_no;
	@Column
	String name;
	@Column
	int age;
	@Column
	String contact_no;
	@Column
	String email;
	
	
	public StudentInfo(int roll_no, String name, int age, String contact_no, String email) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.contact_no = contact_no;
		this.email = email;
	}
	
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentInfo [roll_no=" + roll_no + ", name=" + name + ", age=" + age + ", contact_no=" + contact_no
				+ ", email=" + email + "]";
	}
	
}
