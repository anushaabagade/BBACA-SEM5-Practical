import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeDetailsApp {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmployeeInputFrame().setVisible(true));
    }
}

class EmployeeInputFrame extends JFrame {
    private JTextField enoField;
    private JTextField enameField;
    private JTextField salField;

    public EmployeeInputFrame() {
        setTitle("Employee Details Input");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        JLabel enoLabel = new JLabel("Employee Number:");
        enoField = new JTextField();
        JLabel enameLabel = new JLabel("Employee Name:");
        enameField = new JTextField();
        JLabel salLabel = new JLabel("Salary:");
        salField = new JTextField();

        JButton submitButton = new JButton("Submit");

        add(enoLabel);
        add(enoField);
        add(enameLabel);
        add(enameField);
        add(salLabel);
        add(salField);
        add(new JLabel());
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eno = enoField.getText();
                String ename = enameField.getText();
                String sal = salField.getText();

                try {
                    double salary = Double.parseDouble(sal);
                    new EmployeeDetailsFrame(eno, ename, salary).setVisible(true);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(EmployeeInputFrame.this,
                            "Invalid salary input. Please enter a numeric value.",
                            "Input Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}

class EmployeeDetailsFrame extends JFrame {
    public EmployeeDetailsFrame(String eno, String ename, double salary) {
        setTitle("Employee Details");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 5, 5));

        JLabel enoLabel = new JLabel("Employee Number: " + eno);
        JLabel enameLabel = new JLabel("Employee Name: " + ename);
        JLabel salLabel = new JLabel("Salary: Rs" + String.format("%.2f", salary));

        add(enoLabel);
        add(enameLabel);
        add(salLabel);
    }
}
