package dao;

import model.Transaction;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {
    public boolean recordTransaction(Transaction txn) throws SQLException {
        String sql = "INSERT INTO transactions (account_id, type, amount) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, txn.getAccountId());
            stmt.setString(2, txn.getType());
            stmt.setDouble(3, txn.getAmount());
            return stmt.executeUpdate() > 0;
        }
    }

    public List<Transaction> getTransactionsByAccount(int accountId) throws SQLException {
        List<Transaction> list = new ArrayList<>();
        String sql = "SELECT * FROM transactions WHERE account_id = ? ORDER BY transaction_date DESC";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, accountId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(new Transaction(
                    rs.getInt("transaction_id"),
                    rs.getInt("account_id"),
                    rs.getString("type"),
                    rs.getDouble("amount"),
                    rs.getTimestamp("transaction_date")
                ));
            }
        }
        return list;
    }
}
