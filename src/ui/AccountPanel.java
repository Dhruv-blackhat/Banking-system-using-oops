package ui;

import dao.AccountDAO;
import model.Account;
import model.User;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class AccountPanel extends JFrame {
    public AccountPanel(User user) {
        setTitle("Accounts");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTextArea accountArea = new JTextArea();
        accountArea.setEditable(false);

        try {
            AccountDAO dao = new AccountDAO();
            Account acc = dao.getAccountById(user.getId());
            if (acc != null) {
                accountArea.setText("Account Type: " + acc.getAccountType() + "\nBalance: " + acc.getBalance());
            } else {
                accountArea.setText("No accounts found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            accountArea.setText("Error loading account.");
        }

        add(new JScrollPane(accountArea), BorderLayout.CENTER);
    }
}
