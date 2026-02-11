package com.repository;



import com.db.DBconnection;
import com.model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountRepository {

    public void save(Account account) {

        String sql = """
            INSERT INTO accounts
            (account_number, user_id, account_type, email, phone)
            VALUES (?, ?, ?, ?, ?)
            """;

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, account.getAccountNumber());
            ps.setInt(2, account.getUserId());
            ps.setString(3, account.getAccountType());
            ps.setString(4, account.getEmail());
            ps.setString(5, account.getPhone());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Account findByAccountNumber(String accountNumber) {
        String sql = "SELECT * FROM accounts WHERE account_number = ?";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, accountNumber);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Account(
                        rs.getString("account_number"),
                        rs.getInt("user_id"),
                        rs.getString("account_type"),
                        rs.getString("email"),
                        rs.getString("phone")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Account findByUserId(int userId) {

        String sql = "SELECT * FROM accounts WHERE user_id = ?";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Account(
                    rs.getString("account_number"),
                    rs.getInt("user_id"),
                    rs.getString("account_type"),
                    rs.getString("email"),
                    rs.getString("phone")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
