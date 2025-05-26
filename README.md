# Banking-system-using-oops
🏦 Java Banking System
A desktop-based banking management system built with Java Swing, JDBC, and MySQL. This project demonstrates the use of Object-Oriented Programming (OOP) principles to manage user accounts, perform transactions, and maintain secure database connectivity.

📌 Features
User Registration & Login

Account Creation (Savings/Current)

Deposit & Withdrawal

Balance Inquiry

Transaction History

Swing-based GUI with user-friendly interface

JDBC-based MySQL connectivity

📁 Project Structure
graphql
Copy
Edit
BankingSystem/
├── src/
│   ├── model/           # POJO classes (User, Account, Transaction)
│   ├── dao/             # DAO classes & DBConnection
│   ├── ui/              # Java Swing GUIs (Login, Dashboard, etc.)
│   ├── utils/           # Input validation, password utilities
│   └── Main.java        # Entry point
├── db/
│   └── schema.sql       # MySQL database script
├── assets/              # Screenshots or UI mockups
├── README.md
└── .gitignore
⚙️ Technologies Used
Java (JDK 8+)

Java Swing (GUI)

JDBC (Database Connectivity)

MySQL (Backend DB)

IDE: IntelliJ IDEA / Eclipse



🧩 Database Design
users (id, name, email, password)

accounts (account_id, user_id, account_type, balance)

transactions (transaction_id, account_id, type, amount, transaction_date)

(Relationships: One User → Many Accounts → Many Transactions)


This project is licensed under the MIT License. See the LICENSE file for details.

