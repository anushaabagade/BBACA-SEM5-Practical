import javax.swing.*;
import java.awt.*;

public class TempleDrawingSwing extends JFrame {
    
    public TempleDrawingSwing() {
        setTitle("Temple Drawing");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new TemplePanel());
        setVisible(true);
    }

    private class TemplePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            setBackground(Color.cyan);

            g.setColor(Color.orange);
            g.fillRect(100, 200, 200, 150); // Main body of the temple

            g.setColor(Color.red);
            int[] xPoints = {100, 200, 300};
            int[] yPoints = {200, 100, 200};
            g.fillPolygon(xPoints, yPoints, 3);

            g.setColor(Color.black);
            g.fillRect(170, 250, 60, 100); // Door

            g.setColor(Color.gray);
            g.fillRect(130, 200, 20, 100); // Left pillar
            g.fillRect(250, 200, 20, 100); // Right pillar

            g.setColor(Color.yellow);
            g.fillRect(190, 130, 20, 10); // Top decorative block

            g.setColor(Color.green);
            g.fillRect(150, 280, 20, 20); // Flower pot left
            g.fillRect(240, 280, 20, 20); // Flower pot right
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TempleDrawingSwing::new);
    }
}
