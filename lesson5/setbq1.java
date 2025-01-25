import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setbq1 extends JFrame {
    private JTextField textField;
    private StringBuilder input = new StringBuilder();
    private double num1 = 0;
    private String operator = "";

    public setbq1() {
        setTitle("Simple Calculator");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "=":
                    calculate();
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    if (input.length() > 0) {
                        num1 = Double.parseDouble(input.toString());
                        operator = command;
                        input.setLength(0);
                    }
                    break;
                default:
                    input.append(command);
                    break;
            }

            textField.setText(input.toString());
        }

        private void calculate() {
            if (operator.isEmpty() || input.length() == 0) return;
            double num2 = Double.parseDouble(input.toString());
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Division by zero");
                        return;
                    }
                    break;
            }
            input.setLength(0);
            input.append(result);
            operator = "";
            textField.setText(input.toString());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(setbq1::new);
    }
}
