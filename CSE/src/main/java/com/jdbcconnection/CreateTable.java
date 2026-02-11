package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception{
		// load Driver
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		System.out.println("Driver Loaded Successfully");

		// 2. Create Connection

		String url = "jdbc:mysql://localhost:3306/employeedb";
		String user = "root";
		String password="Aniket";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection Established Successfully.");
		
//		Creating the Statement
		
		String query = "create table teachers (id int,name varchar(50),subject varchar(30))";
		String insert = "insert into teachers values(1,'John Doe','Math')";
		
		String prepared = "insert into teachers values(?,?,?)";
//		String query = "drop table teachers";
		Statement st = con.createStatement();
		int i = st.executeUpdate(insert);
		System.out.println(i + " rows affected...");
		
	}

}
