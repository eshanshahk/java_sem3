import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddNumbersSwing extends JFrame implements ActionListener {

    private JTextField num1Field, num2Field, resultField;
    private JButton addButton;

    public AddNumbersSwing() {
        setTitle("Add Two Numbers");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel num1Label = new JLabel("Enter first number:");
        num1Field = new JTextField();

        JLabel num2Label = new JLabel("Enter second number:");
        num2Field = new JTextField();

        JLabel resultLabel = new JLabel("Sum:");
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("Add");
        addButton.addActionListener(this);

        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(new JLabel()); // empty cell
        add(addButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double sum = num1 + num2;
            resultField.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddNumbersSwing());
    }
}
