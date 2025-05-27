package model;

import java.sql.Timestamp;

public class Transaction {
    private int transactionId;
    private int accountId;
    private String type;
    private double amount;
    private Timestamp transactionDate;

    public Transaction(int transactionId, int accountId, String type, double amount, Timestamp transactionDate) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public int getTransactionId() { return transactionId; }
    public int getAccountId() { return accountId; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public Timestamp getTransactionDate() { return transactionDate; }
}
