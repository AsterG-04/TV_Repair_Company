TV Repair Management System

A Java Swing application for a private TV repair company that manages client records using a MySQL database called RepairDB. It uses JDBC to connect to the database, allowing users to manage logins, TV product data, and customer information.

🌟 Features

User Authentication: The system has an Admin Login form where users must enter a username and password to log in. There is also a separate Main Admin Login form for a main admin who can control other admins.
Database Management: Users can create, edit, and delete database tables. The application protects essential tables from being deleted.
Data Administration: The application allows users to add new clients, change existing ones, and delete entries. It also has a feature to check for duplicate primary key values to ensure data integrity.
Dynamic UI: The interface for creating tables changes dynamically based on the number of columns selected. Labels for text fields also change according to the chosen data table.
💻 Tech Stack

Java Swing : For the graphical user interface (GUI).
MySQL      : The relational database used to store client and product data.
JDBC (Java Database Connectivity): Used to connect to the database and perform data retrieval, alteration, and searching.

🚀 Getting Started
1. Set up a MySQL database named RepairDB.
2. Configure the JDBC connection in the Java code.
3. Run the application to begin managing TV repair records.
