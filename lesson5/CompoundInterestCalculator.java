import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompoundInterestCalculator extends JFrame {

    private JTextField principalField, rateField, timeField, totalAmountField, interestAmountField;
    private JButton calculateButton, clearButton, closeButton;

    public CompoundInterestCalculator() {
        setTitle("Compound Interest Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel titleLabel = new JLabel("Compound Interest Calculator");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        add(titleLabel, gbc);

        JLabel principalLabel = new JLabel("Principal Amount:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(principalLabel, gbc);

        principalField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(principalField, gbc);

        JLabel rateLabel = new JLabel("Interest Rate (%):");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(rateLabel, gbc);

        rateField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(rateField, gbc);

        JLabel timeLabel = new JLabel("Time (Yrs):");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(timeLabel, gbc);

        timeField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        add(timeField, gbc);

        JLabel totalAmountLabel = new JLabel("Total Amount:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(totalAmountLabel, gbc);

        totalAmountField = new JTextField();
        totalAmountField.setEditable(false);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(totalAmountField, gbc);

        JLabel interestAmountLabel = new JLabel("Interest Amount:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(interestAmountLabel, gbc);

        interestAmountField = new JTextField();
        interestAmountField.setEditable(false);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        add(interestAmountField, gbc);

        calculateButton = new JButton("Calculate");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        add(calculateButton, gbc);

        clearButton = new JButton("Clear");
        gbc.gridx = 1;
        gbc.gridy = 6;
        add(clearButton, gbc);

        closeButton = new JButton("Close");
        gbc.gridx = 2;
        gbc.gridy = 6;
        add(closeButton, gbc);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateInterest();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void calculateInterest() {
        try {
            double principal = Double.parseDouble(principalField.getText());
            double rate = Double.parseDouble(rateField.getText());
            double time = Double.parseDouble(timeField.getText());

            double amount = principal * Math.pow(1 + rate / 100, time);
            double interest = amount - principal;

            totalAmountField.setText(String.format("%.2f", amount));
            interestAmountField.setText(String.format("%.2f", interest));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        principalField.setText("");
        rateField.setText("");
        timeField.setText("");
        totalAmountField.setText("");
        interestAmountField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CompoundInterestCalculator().setVisible(true);
            }
        });
    }
}
