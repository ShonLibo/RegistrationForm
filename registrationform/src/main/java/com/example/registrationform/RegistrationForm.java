package com.example.registrationform;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {
    private JTextField emailField, nameField, courseField;
    private JTextArea hobbiesArea;

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
    }


}