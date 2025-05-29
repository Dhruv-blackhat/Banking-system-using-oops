package dao;

import model.User;
import java.sql.*;

public class UserDAO {
    public boolean registerUser(User user) throws SQLException {
        String sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            return stmt.executeUpdate() > 0;
        }
    }
