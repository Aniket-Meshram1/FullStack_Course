package com.jdbcTransaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionApp {

	public static void main(String[] args)  {
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String user = "root";
		String password = "Aniket";
		
		String sql1 = "update accounts set balance = balance - ? where accountNo = ? ";
		String sql2 ="update accounts set balance = balance  + ? where accountNo = ? "; // wrong query to understand transaction.
		
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		try {
			
			// Loading Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// Creating Connection
		 con = DriverManager.getConnection(url,user,password);
		
		 
		 // Transaction Control 
		 
		 
		con.setAutoCommit(false);
		
		// Prepared Statement
		PreparedStatement pst1 = con.prepareStatement(sql1);
		PreparedStatement pst2 = con.prepareStatement(sql2);
		
		System.out.println("Please enter Your account Number :");
		int useracc = sc.nextInt();
		System.out.println("Please enter amount to send :");
		double amount = sc.nextDouble();
		System.out.println("Please enter Reciever Account number : ");
		int recieveacc = sc.nextInt();
		
		
		pst1.setDouble(1, amount);
		pst1.setInt(2, useracc);
		
		pst2.setDouble(1, amount);
		pst2.setInt(2, recieveacc);

		
		pst1.executeUpdate();
		pst2.executeUpdate();
		
		con.commit();
		con.setAutoCommit(true);
		System.out.println("Transaction successfull");
		}catch (Exception e) {
				
				try {
					System.out.println("Error occured Rolling back");
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
		}
		finally {
				try {
					sc.close();

				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
