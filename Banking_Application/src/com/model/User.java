package com.model;

public class User {

    private int userId;
    private String username;
    private String password;
    private double balance;

    // Constructor used when reading from DB
    public User(int userId, String username, String password, double balance) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    // Constructor used during registration
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0.0;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
