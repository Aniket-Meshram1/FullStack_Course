package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String user = "root";
		String password="Aniket";
		Connection con = DriverManager.getConnection(url, user, password);
		String insert = "insert into student values(15,'John Doe',105,'Male')";
		String insert1 = "insert into student values(16,'Mike Whiler',104,'Male')";
		String insert2 = "insert into student values(17,'Sadie Sink',103,'Female')";
		Statement st = con.createStatement();
		st.addBatch(insert);
		st.addBatch(insert1);
		st.addBatch(insert2);
		st.executeBatch();
		System.out.println("Data Added Successfuly");
	

	}

}
