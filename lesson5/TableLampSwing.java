import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TableLampSwing extends JFrame {
    private JPanel lampPanel;
    private Color lampColor;
    private Random random;
    
    public TableLampSwing() {
        setTitle("Table Lamp");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        random = new Random();
        lampPanel = new LampPanel();
        add(lampPanel, BorderLayout.CENTER);

        JButton changeColorButton = new JButton("Change Lamp Color");
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeLampColor();
                lampPanel.repaint();
            }
        });
        add(changeColorButton, BorderLayout.SOUTH);
        
        setVisible(true);
    }

    private void changeLampColor() {
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        lampColor = new Color(r, g, b);
    }

    private class LampPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            g.setColor(Color.gray);
            g.fillRect(150, 250, 100, 20);

            g.setColor(Color.darkGray);
            g.fillRect(180, 150, 40, 100);

            g.setColor(lampColor);
            g.fillArc(150, 100, 100, 80, 0, 180);
            g.setColor(Color.lightGray);
            g.fillRect(150, 180, 100, 10);

            g.setColor(Color.yellow);
            g.fillOval(190, 200, 30, 30);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TableLampSwing::new);
    }
}
