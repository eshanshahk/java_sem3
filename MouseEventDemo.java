import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseEventDemo extends JFrame implements MouseListener, MouseMotionListener {

    private JLabel statusLabel;

    public MouseEventDemo() {
        setTitle("Mouse Events Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        statusLabel = new JLabel("Move the mouse inside the window");
        add(statusLabel, BorderLayout.SOUTH);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        statusLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        statusLabel.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        statusLabel.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        statusLabel.setText("Mouse Entered the panel");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        statusLabel.setText("Mouse Exited the panel");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        statusLabel.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        statusLabel.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseEventDemo());
    }
}
