package model;

public class Account {
    private int accountId;
    private int userId;
    private String accountType;
    private double balance;

    public Account(int accountId, int userId, String accountType, double balance) {
        this.accountId = accountId;
        this.userId = userId;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountId() { return accountId; }
    public void setAccountId(int accountId) { this.accountId = accountId; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}

// File: src/model/Transaction.java
