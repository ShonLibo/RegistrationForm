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
    }
}