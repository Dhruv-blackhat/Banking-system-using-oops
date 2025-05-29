package ui;

import dao.TransactionDAO;
import model.Transaction;
import model.User;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class TransactionPanel extends JFrame {
    public TransactionPanel(User user) {
        setTitle("Transactions");
        setSize(500, 400);
        setLocationRelativeTo(null);

        JTextArea txnArea = new JTextArea();
        txnArea.setEditable(false);

        try {
            TransactionDAO dao = new TransactionDAO();
            List<Transaction> list = dao.getTransactionsByAccount(user.getId());
            for (Transaction txn : list) {
                txnArea.append(txn.getType() + " Rs." + txn.getAmount() + " on " + txn.getTransactionDate() + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            txnArea.setText("Error loading transactions.");
        }

        add(new JScrollPane(txnArea), BorderLayout.CENTER);
    }
}
