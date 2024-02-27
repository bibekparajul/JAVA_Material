import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberReverse {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Reverse");
        frame.setLayout(new GridLayout(3, 2));

        JLabel numberLabel = new JLabel("Number:");
        frame.add(numberLabel);

        JTextField numberField = new JTextField();
        frame.add(numberField);

        JLabel reversedLabel = new JLabel("Reverse:");
        frame.add(reversedLabel);

        JTextField reversedField = new JTextField();
        reversedField.setEditable(false);
        frame.add(reversedField);

        JButton reverseButton = new JButton("Reverse");
        frame.add(reverseButton);

        reverseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numberText = numberField.getText();
                try {
                    int number = Integer.parseInt(numberText);
                    int reversedNumber = reverseNumber(number);
                    reversedField.setText(String.valueOf(reversedNumber));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input! Please enter a valid integer.");
                }
            }
        });

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
