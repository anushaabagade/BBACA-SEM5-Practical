import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setaq5 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Addition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel firstLabel = new JLabel("First Number:");
        JTextField firstText = new JTextField();

        JLabel secondLabel = new JLabel("Second Number:");
        JTextField secondText = new JTextField();

        JLabel resultLabel = new JLabel("Result:");
        JTextField resultText = new JTextField();
        resultText.setEditable(false);

        panel.add(firstLabel);
        panel.add(firstText);
        panel.add(secondLabel);
        panel.add(secondText);
        panel.add(resultLabel);
        panel.add(resultText);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton addButton = new JButton("Add");
        JButton clearButton = new JButton("Clear");
        JButton exitButton = new JButton("Exit");

        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(firstText.getText());
                    double num2 = Double.parseDouble(secondText.getText());
                    double sum = num1 + num2;
                    resultText.setText(Double.toString(sum));
                } catch (NumberFormatException ex) {
                    resultText.setText("Invalid input");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstText.setText("");
                secondText.setText("");
                resultText.setText("");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
