package com.mappingtypes.mapper;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Student;

public class App {
	public static Scanner sc;
	static Configuration conf = null;

	static SessionFactory sf = null;
	static Session s = null;
	static Transaction t = null;
    public static void main(String[] args) {
        
		sc = new Scanner(System.in);
		conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		sf = conf.buildSessionFactory();
		s = sf.openSession();
		t = s.beginTransaction();
		
		

	/*	System.out.print("Enter Your Name : ");
		String name = sc.nextLine();
		System.out.print("Enter your Email address : ");
		String email = sc.nextLine();
		System.out.print("Enter your Phone Number : ");
		String phNo = sc.nextLine();
		System.out.print("Enter you city : ");
		String city = sc.nextLine();
		System.out.print("Enter Your Street : ");
		String street = sc.nextLine();
		
		Address address = new Address(city,street);
		Student s1 = new Student(name,email,phNo,address);
		
		s.persist(s1);
		System.out.println("Student persist Successfully....");
		
		*/
		Student s1 = s.get(Student.class, 2);
		System.out.println(s1);
		t.commit();
		s.close();
		sf.close();
		
		
		

    }
}
