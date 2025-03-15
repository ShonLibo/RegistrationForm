package com.example.registrationform;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.util.Arrays;

class RegistrationFormTest {
    private RegistrationForm registrationForm;

    @BeforeEach
    void setUp() {
        registrationForm = new RegistrationForm();
    }

    @Test
    void testFrameIsCreated() {
        assertNotNull(registrationForm, "RegistrationForm instance should not be null.");
    }

    @Test
    void testButtonExists() {
        JButton[] buttons = Arrays.stream(JFrame.getWindows())
                .filter(JFrame.class::isInstance)
                .map(JFrame.class::cast)
                .flatMap(frame -> Arrays.stream(frame.getContentPane().getComponents()))
                .filter(JPanel.class::isInstance)
                .map(JPanel.class::cast)
                .flatMap(panel -> Arrays.stream(panel.getComponents()))
                .filter(JButton.class::isInstance)
                .map(JButton.class::cast)
                .toArray(JButton[]::new);

        assertTrue(Arrays.stream(buttons).anyMatch(btn -> "Establish DB Connection".equals(btn.getText())),
                "Button should exist in the form.");
    }
}
