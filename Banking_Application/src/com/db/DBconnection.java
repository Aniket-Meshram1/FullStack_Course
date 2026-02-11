package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	
	
static String url = "jdbc:mysql://localhost:3306/bankappdb";
static String user = "root";
static String password = "Aniket";
	public static Connection getConnection()  throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url,user,password);
		
	}

}
