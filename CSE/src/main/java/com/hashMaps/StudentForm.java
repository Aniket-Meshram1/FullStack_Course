package com.hashMaps;

public class StudentForm {

	String name;
	int age;
	String gender;
	String mobNo;
	int marks;
	int sem;
	String email;
	String address;
	float height;
	int weight;
	String bloodGroup;
	public StudentForm(String name, int age, String gender, String mobNo, int marks, int sem, String email,
			String address, float height, int weight, String bloodGroup) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobNo = mobNo;
		this.marks = marks;
		this.sem = sem;
		this.email = email;
		this.address = address;
		this.height = height;
		this.weight = weight;
		this.bloodGroup = bloodGroup;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	@Override
	public String toString() {
		return "StudentForm [name=" + name + ", age=" + age + ", gender=" + gender + ", mobNo=" + mobNo + ", marks="
				+ marks + ", sem=" + sem + ", email=" + email + ", address=" + address + ", height=" + height
				+ ", weight=" + weight + ", bloodGroup=" + bloodGroup + "]";
	}
	
	
}
