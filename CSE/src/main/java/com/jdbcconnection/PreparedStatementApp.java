package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class PreparedStatementApp {

	public static void main(String[] args) throws Exception{
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
		String query = "insert into teachers(id,name,subject) values (?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id of Teacher : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name of Teacher : ");
		String name = sc.nextLine();
		System.out.println("Enter subject of teacher : ");
		String subject = sc.nextLine();
		
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, subject);
		
		int row = pst.executeUpdate();
		System.out.println(row + " rows inserted");
		
		con.close();
		sc.close();
	}

}
