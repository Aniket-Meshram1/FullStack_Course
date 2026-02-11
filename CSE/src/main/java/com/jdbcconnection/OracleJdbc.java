package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class OracleJdbc {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully...");
		
		
		String url = "jdbc:oracle:thin:@localhost:1522/orclpdb";
				
		String user = "System";
		String password="Aniket";
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection Successfull");
		
		String query = "insert into Phone (id,Brand,price) values (?,?,?)";
		PreparedStatement st = con.prepareStatement(query);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id of Phone : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the brand Of Phone : ");
		String brand = sc.nextLine();
		System.out.println("Enter The Price of Phone : ");
		int price = sc.nextInt();
		
		st.setInt(1, id);
		st.setString(2, brand);
		st.setInt(3, price);
		
		
		int n = st.executeUpdate();
		System.out.println(n+" row affected");
		
		con.close();
		sc.close();
	}

}
