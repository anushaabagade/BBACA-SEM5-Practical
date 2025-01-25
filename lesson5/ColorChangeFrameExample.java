import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class ColorChangeFrameExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ColorChangeFrame().setVisible(true));
    }
}

class ColorChangeFrame extends JFrame {

    private JButton colorChangeButton;

    public ColorChangeFrame() {
        setTitle("Color Change Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        colorChangeButton = new JButton("Change Color");
        colorChangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeFrameColor();
            }
        });

        add(colorChangeButton, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                changeFramePosition();
            }
        });
    }

    private void changeFrameColor() {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        getContentPane().setBackground(new Color(r, g, b));
    }

    private void changeFramePosition() {
        int x = new Random().nextInt(Toolkit.getDefaultToolkit().getScreenSize().width - getWidth());
        int y = new Random().nextInt(Toolkit.getDefaultToolkit().getScreenSize().height - getHeight());
        setLocation(x, y);
    }
}
