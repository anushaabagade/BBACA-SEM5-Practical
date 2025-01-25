import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setbq2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu searchMenu = new JMenu("Search");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(searchMenu);

        frame.setJMenuBar(menuBar);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));  // Padding around buttons

        JButton undoButton = new JButton(new ImageIcon("undo_icon.png"));
        undoButton.setText("Undo");
        JButton redoButton = new JButton(new ImageIcon("redo_icon.png"));
        redoButton.setText("Redo");
        JButton cutButton = new JButton(new ImageIcon("cut_icon.png"));
        cutButton.setText("Cut");
        JButton copyButton = new JButton(new ImageIcon("copy_icon.png"));
        copyButton.setText("Copy");
        JButton pasteButton = new JButton(new ImageIcon("paste_icon.png"));
        pasteButton.setText("Paste");

        buttonPanel.add(undoButton);
        buttonPanel.add(redoButton);
        buttonPanel.add(cutButton);
        buttonPanel.add(copyButton);
        buttonPanel.add(pasteButton);

        frame.add(buttonPanel, BorderLayout.CENTER);

        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Undo action performed");
            }
        });

        redoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Redo action performed");
            }
        });

        cutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Cut action performed");
            }
        });

        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Copy action performed");
            }
        });

        pasteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Paste action performed");
            }
        });

        frame.setVisible(true);
    }
}
