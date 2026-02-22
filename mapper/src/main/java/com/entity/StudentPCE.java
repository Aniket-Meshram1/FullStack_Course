package com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class StudentPCE {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int s_id;
	@Column
	String name;
	@Column
	String email;
	@Column
	String phone;
	@OneToMany(mappedBy = "StudentPCE" ,cascade = CascadeType.ALL)
	List<Courses> course;
	public StudentPCE( String name, String email, String phone, List<Courses> course) {
		super();
	
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.course = course;
	}
	public StudentPCE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
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
	public List<Courses> getCourse() {
		return course;
	}
	public void setCourse(List<Courses> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "StudentPCE [s_id=" + s_id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", course="
				+ course + "]";
	}
	
}
