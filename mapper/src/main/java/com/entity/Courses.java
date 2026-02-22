package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Courses {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
@Column
String name;
@ManyToOne(cascade =CascadeType.ALL )
@JoinColumn(name="s_id",referencedColumnName = "s_id")
StudentPCE StudentPCE;
public Courses( String name, StudentPCE studentpce) {
	super();
	
	this.name = name;
	this.StudentPCE = studentpce;
}
public Courses() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public StudentPCE getStudentPCE() {
	return StudentPCE;
}
public void setStudentPCE(StudentPCE studentpce) {
	this.StudentPCE = studentpce;
}
@Override
public String toString() {
	return "Courses [id=" + id + ", name=" + name + ", studentpce=" + StudentPCE + "]";
}


}
