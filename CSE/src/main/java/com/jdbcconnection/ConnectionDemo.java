package com.jdbcconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception {
		
//		first download the mysql connector from chrome and get the jar file
		
//		1. Loading The Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		System.out.println("Driver Loaded Successfully");
		
//		2. Establishing Connection
		
		
//		url for the Oracle database connection
//		String url = "oracle:jdbc:thin:@localhost:1521:xe" ;
	
		
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String user = "root";
		String password="Aniket";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection Established Successfully.");
		
//		Creating the Statement
		 String query = "Select * from student";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getInt(3)+" "+rs.getString(4));
		}
		

	}

}
