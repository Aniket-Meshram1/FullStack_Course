package com.PCE.HibernateDemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.StudentInfo;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {

		// Configure the hibernate.cf.xml file
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		System.out.println("Successfully");

		// build the session factory
		SessionFactory sf = cf.buildSessionFactory();
		
		// open session factory
		Session s = sf.openSession();
		StudentInfo s1 = new StudentInfo(1, "Aniket", 21, "9322688979", "aniket@gmail.com");
		// begin transaction
		Transaction t = s.beginTransaction();
		// insert the object 
		s.persist(s1);
		// commit the transaction
		t.commit();
		System.out.println("Data inserted Successfully");
		// close the resources
		sf.close();
		s.close();

//    	String url = "jdbc:mysql://localhost:3306/employeedb";
//		String user = "root";
//		String pass ="Aniket";
//		Connection con = null;
//		CallableStatement cl = null;
//		Scanner sc  = new Scanner(System.in);
//		String sql = "Select * from aniketBank ";
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection(url,user,pass);
//			Statement st = con.createStatement();
//			
//			ResultSet rs = st.executeQuery(sql);
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				con.close();
//				sc.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
