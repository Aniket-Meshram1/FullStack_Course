package com.model;

public class Account {

    private String accountNumber;
    private int userId;
    private String accountType;
    private String email;
    private String phone;

    public Account(String accountNumber, int userId,
                   String accountType, String email, String phone) {
        this.accountNumber = accountNumber;
        this.userId = userId;
        this.accountType = accountType;
        this.email = email;
        this.phone = phone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
