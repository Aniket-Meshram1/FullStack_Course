package com.aniket;
import java.util.*;

public class FormApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter your Name :");
		String name = sc.nextLine();
		System.out.print("Enter your Age : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter your Gender : ");
		String gender = sc.nextLine();
		
		System.out.print("Enter your Mobile number : ");
		String mobileNo = sc.nextLine();
		
		System.out.print("Enter your Address : ");
		String address = sc.nextLine();
		
		System.out.print("Enter your College Id : ");
		String collegeId = sc.nextLine();
		
		System.out.print("Enter your College Name : ");
		String collegeName = sc.nextLine();
		
		System.out.print("Enter your Adhar number : ");
		long adhar= sc.nextLong();
		sc.nextLine();
		System.out.print("Enter your Email : ");
		String email = sc.nextLine();
		
		System.out.print("Enter your Status : ");
		String status = sc.nextLine();
		
		System.out.println("\n\n---Personal Dtails---- ");
		System.out.println("\nYour Name is : "+name);
		System.out.println("Your age is : "+age);
		System.out.println("Your gender is : "+gender);
		System.out.println("Your Address is : "+address);
		System.out.println("Your College ID is : "+collegeId);
		System.out.println("Your College Name is : "+collegeName);
		System.out.println("Your Adhar number is : "+adhar);
		System.out.println("Your Email is : "+email);
		System.out.println("Your Status is : "+status);
		
		sc.close();

		
		
		
		

	}

}
