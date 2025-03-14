package com.example.registrationform;

import com.example.databaseconnection.DatabaseConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    private JTextField emailField, nameField, courseField;
    private JTextArea hobbiesArea;
    private JButton dbConnectionButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Email Field
        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        // Name Field
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        // Course Field
        add(new JLabel("Course:"));
        courseField = new JTextField();
        add(courseField);

        // Hobbies Area
        add(new JLabel("Hobbies:"));
        hobbiesArea = new JTextArea();
        add(new JScrollPane(hobbiesArea));

        // Database Connection Button
        dbConnectionButton = new JButton("Establish DB Connection");
        dbConnectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseConnection.connect();
            }
        });
        add(dbConnectionButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationForm());
    }
}