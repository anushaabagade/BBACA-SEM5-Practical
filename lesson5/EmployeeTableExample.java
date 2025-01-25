import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class EmployeeTableExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmployeeTableFrame().setVisible(true));
    }
}

class EmployeeTableFrame extends JFrame {
    public EmployeeTableFrame() {
        setTitle("Employee Records");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columnNames = {"Employee Number", "Employee Name", "Salary"};

        Object[][] data = {
            {"E001", "John Doe", 50000},
            {"E002", "Jane Smith", 60000},
            {"E003", "Alice Johnson", 55000},
            {"E004", "Bob Brown", 62000},
            {"E005", "Charlie Davis", 47000}
        };

        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);
    }
}
