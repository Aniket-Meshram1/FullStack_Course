package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Transaction;
import com.db.DBconnection;

public class TransactionRepository {

    // Save a new transaction (deposit / withdraw)
    public void save(Transaction transaction) {

        String sql = """
        		INSERT INTO transactions 
                (account_number, transaction_type, amount) 
                VALUES (?, ?, ?)
               """ 
                ;

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, transaction.getAccountNumber());
            ps.setString(2, transaction.getTransactionType());
            ps.setDouble(3, transaction.getAmount());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get all transactions for an account
    public List<Transaction> findByAccountNumber(String accountNumber) {

        List<Transaction> transactions = new ArrayList<>();

        String sql = "SELECT * FROM transactions WHERE account_number = ? " +
                     "ORDER BY transaction_date ";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, accountNumber);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Transaction tx = new Transaction(
                        rs.getInt("transaction_id"),
                        rs.getString("account_number"),
                        rs.getString("transaction_type"),
                        rs.getDouble("amount"),
                        rs.getTimestamp("transaction_date")
                );
                transactions.add(tx);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return transactions;
    }
}
