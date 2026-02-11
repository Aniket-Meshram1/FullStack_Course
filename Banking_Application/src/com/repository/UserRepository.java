package com.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.db.DBconnection;
import com.model.User;

public class UserRepository {

	public int save(User user) {

		String sql = "INSERT INTO users (username,password,balance) VALUES (?,?,?)";
		try (Connection con = DBconnection.getConnection();
				PreparedStatement pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.setDouble(3, user.getBalance());

			pst.executeUpdate();
			ResultSet rs = pst.getGeneratedKeys();
			if (rs.next()) {
				return rs.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;

	}

	public User findByUser_id(int userId) {

		String sql = "SELECT * FROM users WHERE user_id = ?";
		try (Connection con = DBconnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setInt(1, userId);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return new User(rs.getInt("user_id"), 
						rs.getString("username"),
						rs.getString("password"),
						rs.getDouble("balance"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public User findByUsername(String username) {
		String sql = "SELECT * FROM users WHERE username = ?";
		try (Connection con = DBconnection.getConnection();
				PreparedStatement pst = con.prepareStatement(sql)){
			pst.setString(1,username);
			ResultSet rs =  pst.executeQuery();
			if(rs.next()) {
				return new User(
						rs.getInt("user_id"),
						rs.getString("username"),
						rs.getString("password"),
						rs.getDouble("balance")
						);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void updateBalance(int user_id,double balance) {
		String sql = "UPDATE users SET balance = ? WHERE user_id = ?";
		try(Connection con = DBconnection.getConnection();
				PreparedStatement pst = con.prepareStatement(sql)){
			pst.setDouble(1, balance);
			pst.setInt(2,user_id);
			pst.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updatePassword(int userId, String newPassword) {

	    String sql = "UPDATE users SET password = ? WHERE user_id = ?";

	    try (Connection con = DBconnection.getConnection();
	         PreparedStatement ps = con.prepareStatement(sql)) {

	        ps.setString(1, newPassword);
	        ps.setInt(2, userId);
	        ps.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


}
//
//	Map<Integer, User> accounts = new HashMap<>();
//
//	public void saveUser(User user) {
//		accounts.put(user.getAccount_No(), user);
//	}
//
//	public User findUser(int acc_No) {
//		return accounts.get(acc_No);
//	}
//
//	public boolean userExist(User user) {
//		return accounts.containsKey(user.getAccount_No());
//	}
//	
//	
//	
//
//	
//	

//}
