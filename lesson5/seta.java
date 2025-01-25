import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class seta extends JFrame implements MouseMotionListener, KeyListener {
    private int mouseX = 0;
    private int mouseY = 0;
    private String keyPressed = "None";

    public seta() {
        setTitle("Mouse and Keyboard Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString("Mouse X: " + mouseX, 20, 50);
                g.drawString("Mouse Y: " + mouseY, 20, 70);
                g.drawString("Key Pressed: " + keyPressed, 20, 90);
            }
        };

        panel.addMouseMotionListener(this);
        panel.addKeyListener(this);
        panel.setFocusable(true); // To receive keyboard events
        add(panel, BorderLayout.CENTER);
        
        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyPressed = "Key Code: " + e.getKeyCode();
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyPressed = "None";
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new seta());
    }
}
