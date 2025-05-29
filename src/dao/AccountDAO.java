package dao;

import model.Account;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {
    public boolean createAccount(Account acc) throws SQLException {
        String sql = "INSERT INTO accounts (user_id, account_type, balance) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, acc.getUserId());
            stmt.setString(2, acc.getAccountType());
            stmt.setDouble(3, acc.getBalance());
            return stmt.executeUpdate() > 0;
        }
    }

    public Account getAccountById(int accountId) throws SQLException {
        String sql = "SELECT * FROM accounts WHERE account_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, accountId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Account(
                    rs.getInt("account_id"),
                    rs.getInt("user_id"),
                    rs.getString("account_type"),
                    rs.getDouble("balance")
                );
            }
        }
        return null;
    }

    public boolean updateBalance(int accountId, double newBalance) throws SQLException {
        String sql = "UPDATE accounts SET balance = ? WHERE account_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, newBalance);
            stmt.setInt(2, accountId);
            return stmt.executeUpdate() > 0;
        }
    }
}
