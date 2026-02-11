package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CrudOperationApp {
	static String url = "jdbc:mysql://localhost:3306/crudoperation";
	static String user = "root";
	static String password="Aniket";
	static Scanner sc = new Scanner(System.in);
public static void main(String [] args)  throws Exception{
	createTable();
	
}

public static void crud() throws Exception{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con =  DriverManager.getConnection(url,user,password);
	
	
	
}
public static void createTable() throws Exception{
	System.out.println("Enter table Name : ");
	String table = sc.next();
	String query = "create table "+ table +" (id int primary key auto_increment,name varchar(30),marks int)";
	Connection con =  DriverManager.getConnection(url,user,password);
	PreparedStatement pst = con.prepareStatement(query);
	pst.executeUpdate();
	System.out.println(table+ " table Created Successfuly...");
}

public static void insert() {
	
}

}

