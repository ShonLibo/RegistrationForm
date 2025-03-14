package com.example.registrationform;


import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {
    private JFrame registrationFrame;

    public RegistrationForm() {
        createRegistrationForm();
     }

    private void createRegistrationForm() {
        registrationFrame = new JFrame("Registration");
        registrationFrame.setSize(500, 400);
        registrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registrationFrame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Registration Form", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        registrationFrame.add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

        JTextField emailField = new JTextField();
        JTextField nameField = new JTextField();
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        JComboBox<String> courseCombo = new JComboBox<>(new String[]{"Computer Science", "Information Technology", "Physics", "Chemistry"});

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Hobbies");
        DefaultMutableTreeNode sportsNode = new DefaultMutableTreeNode("Sports");
        sportsNode.add(new DefaultMutableTreeNode("Football"));
        sportsNode.add(new DefaultMutableTreeNode("Basketball"));
        root.add(sportsNode);

        DefaultMutableTreeNode artsNode = new DefaultMutableTreeNode("Arts");
        artsNode.add(new DefaultMutableTreeNode("Painting"));
        root.add(artsNode);

        JTree hobbiesTree = new JTree(root);

        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);
        formPanel.add(new JLabel("Name:"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        formPanel.add(genderPanel);
        formPanel.add(new JLabel("Course:"));
        formPanel.add(courseCombo);
        formPanel.add(new JLabel("Hobbies:"));
        formPanel.add(new JScrollPane(hobbiesTree));


        // View button
        JButton viewButton = new JButton("Establish DB Connection");
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(viewButton);

        registrationFrame.add(formPanel, BorderLayout.CENTER);
        registrationFrame.add(buttonPanel, BorderLayout.SOUTH);
        registrationFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationForm());
    }

}