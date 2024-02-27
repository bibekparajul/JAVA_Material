import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArmstrongChecker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Armstrong Checker");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel numberLabel = new JLabel("Number:");
        frame.add(numberLabel);

        JTextField numberField = new JTextField(10);
        frame.add(numberField);

        JButton checkButton = new JButton("Check");
        frame.add(checkButton);

        JLabel resultLabel = new JLabel();
        frame.add(resultLabel);

        JLabel armstrongLabel = new JLabel();
        frame.add(armstrongLabel);

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numberText = numberField.getText();
                try {
                    int number = Integer.parseInt(numberText);
                    if (isArmstrong(number)) {
                        armstrongLabel.setText("It is Armstrong");
                    } else {
                        armstrongLabel.setText("It is not Armstrong");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input! Please enter a valid integer.");
                }
            }

            private boolean isArmstrong(int number) {
                int originalNumber, remainder, result = 0, n = 0;
                originalNumber = number;
                while (originalNumber != 0) {
                    originalNumber /= 10;
                    ++n;
                }
                originalNumber = number;
                while (originalNumber != 0) {
                    remainder = originalNumber % 10;
                    result += Math.pow(remainder, n);
                    originalNumber /= 10;
                }
                return result == number;
            }
        });

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
