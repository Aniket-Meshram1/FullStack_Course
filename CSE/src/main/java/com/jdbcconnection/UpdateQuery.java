package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateQuery {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String user = "root";
		String password = "Aniket";
		Connection con = DriverManager.getConnection(url,user,password);
		String query = "update student set student_Name = 'Aniket' where student_Id = 10";
		Statement st = con.createStatement();
		int n = st.executeUpdate(query);
		System.out.println(n+" row affected");
		
		
		con.close();
		
	}

}
