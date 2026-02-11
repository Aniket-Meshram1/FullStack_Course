package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class GetDataPrepareStat {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfull");

		String url = "jdbc:mysql://localhost:3306/employeedb";
		String user = "root";
		String password = "Aniket";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection Established Successfuly");
		String query = "Select * from student where student_Id = ?";

		PreparedStatement pst = con.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The id of Student :");
		int id = sc.nextInt();
		pst.setInt(1, id);  
		ResultSet rs = pst.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
		}
		con.close();
		pst.close();
		sc.close();

	}

}
