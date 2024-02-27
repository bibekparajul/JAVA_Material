import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Interest Calculator");
        frame.setLayout(new GridLayout(5, 2));

        JLabel principalLabel = new JLabel("Principal:");
        frame.add(principalLabel);

        JTextField principalField = new JTextField();
        frame.add(principalField);

        JLabel rateLabel = new JLabel("Rate:");
        frame.add(rateLabel);

        JTextField rateField = new JTextField();
        frame.add(rateField);

        JLabel timeLabel = new JLabel("Time:");
        frame.add(timeLabel);

        JTextField timeField = new JTextField();
        frame.add(timeField);

        JLabel resultLabel = new JLabel("Simple Interest:");
        frame.add(resultLabel);

        JLabel interestLabel = new JLabel();
        frame.add(interestLabel);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double principal = Double.parseDouble(principalField.getText());
                    double rate = Double.parseDouble(rateField.getText());
                    double time = Double.parseDouble(timeField.getText());

                    double interest = (principal * rate * time) / 100;
                    interestLabel.setText(String.format("%.2f", interest));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input! Please enter valid numbers.");
                }
            }
        });
        frame.add(calculateButton);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
