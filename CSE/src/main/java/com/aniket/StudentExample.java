package com.aniket;

public class StudentExample {
	public static void main(String [] args) {
		
		Students s1 = new Students();
		System.out.println("Before Assigning.");
		System.out.println(s1.name+"\n"+s1.age+"\n"+s1.gender+"\n");
		s1.name = "Aniket";
		s1.age = 21;
		s1.gender = "Male";
		System.out.println("After Assigning.");
		System.out.println(s1.name+"\n"+s1.age+"\n"+s1.gender+"\n");
		
		
	
	}

}
class Students {
	String name;
	int age;
	String gender;
	void study() {
		System.out.println("Studying..");
	}

	
	
}
