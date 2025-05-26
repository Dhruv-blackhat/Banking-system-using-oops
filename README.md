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

🛠️ Setup Instructions
Clone this repository:

bash
Copy
Edit
git clone https://github.com/your-username/java-banking-system.git
Import into your Java IDE (Eclipse/IntelliJ).

Set up the MySQL database:

Create a database named banking_system

Run the schema.sql file located in /db/

Update DB credentials in DBConnection.java:

java
Copy
Edit
String url = "jdbc:mysql://localhost:3306/banking_system";
String username = "root";
String password = "your_password";
Build and run the project using Main.java.

🧩 Database Design
users (id, name, email, password)

accounts (account_id, user_id, account_type, balance)

transactions (transaction_id, account_id, type, amount, transaction_date)

(Relationships: One User → Many Accounts → Many Transactions)


This project is licensed under the MIT License. See the LICENSE file for details.

