import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {

    private JTextField nameField, regNoField, emailField;
    private JRadioButton maleButton, femaleButton;
    private JComboBox<String> branchCombo;
    private JTextArea addressArea;
    private JButton saveButton;
    private ButtonGroup genderGroup;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);
        gbc.gridx = 1;
        add(nameField, gbc);

        JLabel regNoLabel = new JLabel("Register No:");
        regNoField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(regNoLabel, gbc);
        gbc.gridx = 1;
        add(regNoField, gbc);

        JLabel emailLabel = new JLabel("Email Id:");
        emailField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(emailLabel, gbc);
        gbc.gridx = 1;
        add(emailField, gbc);

        JLabel genderLabel = new JLabel("Gender:");
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(genderLabel, gbc);
        gbc.gridx = 1;
        add(genderPanel, gbc);

        JLabel branchLabel = new JLabel("Branch:");
        String[] branches = {"Computer Science", "Electronics", "Mechanical", "Civil", "Electrical"};
        branchCombo = new JComboBox<>(branches);
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(branchLabel, gbc);
        gbc.gridx = 1;
        add(branchCombo, gbc);

        JLabel addressLabel = new JLabel("Address:");
        addressArea = new JTextArea(4, 20);
        JScrollPane scrollPane = new JScrollPane(addressArea);
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(addressLabel, gbc);
        gbc.gridx = 1;
        add(scrollPane, gbc);

        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 6;
        add(saveButton, gbc);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String regNo = regNoField.getText();
        String email = emailField.getText();
        String gender = maleButton.isSelected() ? "Male" : femaleButton.isSelected() ? "Female" : "Not Selected";
        String branch = (String) branchCombo.getSelectedItem();
        String address = addressArea.getText();

        String message = "Name: " + name +
                "\nRegister No: " + regNo +
                "\nEmail Id: " + email +
                "\nGender: " + gender +
                "\nBranch: " + branch +
                "\nAddress: " + address;

        JOptionPane.showMessageDialog(this, message, "Student Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentRegistrationForm());
    }
}
