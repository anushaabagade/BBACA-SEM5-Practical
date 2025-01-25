import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmailRegistrationForm extends JFrame {
    
    public EmailRegistrationForm() {
        setTitle("Email Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        
        JLabel countryLabel = new JLabel("Country:");
        String[] countries = {"Select", "USA", "Canada", "UK", "Australia"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        
        JLabel termsLabel = new JLabel("Accept Terms:");
        JCheckBox termsCheckBox = new JCheckBox("I agree to the terms and conditions.");
        
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        
        gbc.insets = new Insets(5, 5, 5, 5);
        
        gbc.gridx = 0; gbc.gridy = 0;
        add(nameLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        add(nameField, gbc);
        
        gbc.gridx = 0; gbc.gridy = 1;
        add(emailLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        add(emailField, gbc);
        
        gbc.gridx = 0; gbc.gridy = 2;
        add(passwordLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        add(passwordField, gbc);
        
        gbc.gridx = 0; gbc.gridy = 3;
        add(genderLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        add(genderPanel, gbc);
        
        gbc.gridx = 0; gbc.gridy = 4;
        add(countryLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 4;
        add(countryComboBox, gbc);
        
        gbc.gridx = 0; gbc.gridy = 5;
        add(termsLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 5;
        add(termsCheckBox, gbc);
        
        gbc.gridx = 0; gbc.gridy = 6;
        add(submitButton, gbc);
        gbc.gridx = 1; gbc.gridy = 6;
        add(resetButton, gbc);
        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(EmailRegistrationForm.this, "Registration Successful!");
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset the form
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");
                genderGroup.clearSelection();
                countryComboBox.setSelectedIndex(0);
                termsCheckBox.setSelected(false);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EmailRegistrationForm().setVisible(true);
        });
    }
}
