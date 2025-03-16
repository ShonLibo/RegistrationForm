package com.example.databaseconnection;


public class DatabaseConnection {
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    public static void connect() {
        String url = "jdbc:mysql://localhost:3306/yourdatabase";
        String user = "yourusername";
        String password = "yourpassword";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            JOptionPane.showMessageDialog(null, "Connected to the database successfully!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to connect to the database: " + e.getMessage());
        }
    }
}

