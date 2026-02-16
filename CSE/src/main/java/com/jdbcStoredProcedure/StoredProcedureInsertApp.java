package com.jdbcStoredProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StoredProcedureInsertApp {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String user = "root";
		String pass ="Aniket";
		Connection con = null;
		CallableStatement cl = null;
		Scanner sc  = new Scanner(System.in);
		ResultSet rs = null;
		String sql = "call input(?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			cl = con.prepareCall(sql);
			System.out.println("Enter Account Number : ");
			int acc =sc.nextInt();
			sc.nextLine();
			System.out.println("Enter User Name : ");
			String name= sc.nextLine();
			System.out.println("Enter Amount to add : ");
			int amount = sc.nextInt();
			
			cl.setInt(1, acc);
			cl.setString(2, name);
			cl.setInt(3, amount);
			
			 int n = cl.executeUpdate();
			 if(n >0) {
				 System.out.println(n+" rows inserted successfuly!!!!!!");
			 }else {
				 System.out.println("Procedure causes Error!!!!!!!!");
			 }
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				sc.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
