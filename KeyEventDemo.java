import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyEventDemo extends JFrame implements KeyListener {

    private JLabel statusLabel;

    public KeyEventDemo() {
        setTitle("Key Events Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        statusLabel = new JLabel("Press any key inside the window");
        add(statusLabel, BorderLayout.SOUTH);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setFocusable(true);
        panel.addKeyListener(this);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        statusLabel.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        statusLabel.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        statusLabel.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KeyEventDemo());
    }
}
