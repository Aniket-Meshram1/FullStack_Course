package com.forEach;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student("Aniket",21,"Male");
		Student s2 = new Student("Sourabh",23,"Male");
		Student s3 = new Student("Aarti",18,"Female");
		Student [] info = {s1,s2,s3};
		for(Student s : info) {
			System.out.print(s.getName()+" ");
			System.out.print(s.getAge()+" ");
			System.out.println(s.getGender()+" ");
			System.out.println("------------------");
		}

	}

}
