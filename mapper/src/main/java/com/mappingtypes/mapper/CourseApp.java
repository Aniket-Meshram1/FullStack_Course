package com.mappingtypes.mapper;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Courses;
import com.entity.StudentPCE;

public class CourseApp {
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
		
		Courses c1 = new Courses();
		c1.setName("Java");
		Courses c2 = new Courses();
		c2.setName("Python");
		Courses c3 = new Courses();
		c3.setName("C#");
		ArrayList<Courses> list =  new ArrayList<Courses>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		StudentPCE s1 = new StudentPCE();
		s1.setName("Aniket M");
		s1.setEmail("aniket@gmail.com");
		s1.setPhone("9638527410");
		s1.setCourse(list);
		c1.setStudentPCE(s1);
		c2.setStudentPCE(s1);
		c3.setStudentPCE(s1);
		
		s.persist(s1);
		t.commit();
		s.close();
		sf.close();
	}

}
