package com.PCE.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.StudentInfo;

public class ReadObjectApp {

	public static void main(String[] args) {
		
		// Configuring the Hibernate
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		
		// Build Session Factory
		 SessionFactory sf =  cf.buildSessionFactory();
		 // open Session
		 Session session = sf.openSession();
		 
		 Transaction t = session.beginTransaction();
		 
		 StudentInfo s1 = session.get(StudentInfo.class, 1);
		 
		 if(s1!=null) {
			 System.out.println(s1);
		 }else {
			 System.out.println("No data found ");
		 }
		 t.commit();
		 session.close();
		 sf.close();
		 
	}

}
