package com.jdbcStoredProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class StoredProcedureCallerApp {

	public static void main(String[] args)  {
		
		
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String user = "root";
		String pass ="Aniket";
		Connection con = null;
		CallableStatement cl = null;
		Scanner sc  = new Scanner(System.in);
		ResultSet rs = null;
		String sql ="call dataretrieve (?)";
		
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection(url,user,pass);
		cl = con.prepareCall(sql);
		System.out.println("Please Enter Your Account Number: ");
		int acc = sc.nextInt();
		cl.setInt(1, acc);
		boolean result = cl.execute();
		if(result) {
			rs = cl.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}else {
			System.out.println("No data Found");
		}
		
		
 	}catch(Exception e) {
 		e.printStackTrace();
 		
 	}finally {
 		
 		try {
			con.close();
			sc.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
		
	}

}
