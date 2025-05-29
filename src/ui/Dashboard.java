package ui;

import model.User;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    private User user;

    public Dashboard(User user) {
        this.user = user;
        setTitle("Banking Dashboard");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        JLabel welcomeLabel = new JLabel("Welcome, " + user.getName() + "!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton accountButton = new JButton("View Accounts");
        JButton transactionButton = new JButton("View Transactions");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.add(welcomeLabel);
        panel.add(accountButton);
        panel.add(transactionButton);

        add(panel);

        accountButton.addActionListener(e -> {
            new AccountPanel(user).setVisible(true);
        });

        transactionButton.addActionListener(e -> {
            new TransactionPanel(user).setVisible(true);
        });
    }
}
