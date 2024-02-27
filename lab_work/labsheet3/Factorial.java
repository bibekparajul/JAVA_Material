import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Factorial {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Factorial Calculator");
        frame.setLayout(new GridLayout(3, 2));

        JLabel numberLabel = new JLabel("Number:");
        frame.add(numberLabel);

        JTextField numberField = new JTextField();
        frame.add(numberField);

        JLabel resultLabel = new JLabel("Result:");
        frame.add(resultLabel);

        JTextField resultField = new JTextField();
        resultField.setEditable(false);
        frame.add(resultField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(numberField.getText());
                    if (number < 0) {
                        JOptionPane.showMessageDialog(frame, "Please enter a non-negative integer.");
                        return;
                    }
                    long factorial = 1;
                    for (int i = 1; i <= number; i++) {
                        factorial *= i;
                    }
                    resultField.setText(String.valueOf(factorial));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input! Please enter a valid integer.");
                }
            }
        });
        frame.add(calculateButton);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
