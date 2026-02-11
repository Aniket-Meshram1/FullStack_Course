package com.model;

import java.sql.Timestamp;

public class Transaction {

    private int transactionId;
    private String accountNumber;
    private String transactionType; // DEPOSIT or WITHDRAW
    private double amount;
    private Timestamp transactionDate;

    // Constructor used when reading from DB
    public Transaction(int transactionId, String accountNumber,
                       String transactionType, double amount,
                       Timestamp transactionDate) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    // Constructor used when inserting new transaction
    public Transaction(String accountNumber,
                       String transactionType, double amount) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }
}
