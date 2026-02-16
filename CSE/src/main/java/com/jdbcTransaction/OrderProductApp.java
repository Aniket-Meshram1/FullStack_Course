package com.jdbcTransaction;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderProductApp {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demodb";
		String user = "root";
		String password = "Aniket";

		String sql1 = "insert into orderDetails values(?,?,?)";
		String sql2 = "update products set quantity = quantity - ? where  p_id= ?";

		Connection con = null;

		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);

			con.setAutoCommit(false);

			PreparedStatement pst1 = con.prepareStatement(sql1);
			PreparedStatement pst2 = con.prepareStatement(sql2);
			System.out.println("Enter Order Id : ");
			int o_id = sc.nextInt();
			System.out.println("Enter product id : ");
			int p_id = sc.nextInt();
			System.out.println("Enter quantity : ");
			int qua = sc.nextInt();

			pst1.setInt(1, o_id);
			pst1.setInt(2, p_id);
			pst1.setInt(3, qua);

			pst2.setInt(1, qua);
			pst2.setInt(2, p_id);

			pst1.executeUpdate();
			pst2.executeUpdate();

			con.commit();
			con.setAutoCommit(true);
			System.out.println("Order Placed Successfuly");

		} catch (Exception e) {

			try {
				System.out.println("Order Fail rolling Back");

				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}finally {
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
