import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrimeCheck{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prime Checker");
        frame.setLayout(new GridLayout(3, 2));

        JLabel numberLabel = new JLabel("Number:");
        frame.add(numberLabel);

        JTextField numberField = new JTextField();
        frame.add(numberField);

        JLabel primeLabel = new JLabel("Prime:");
        frame.add(primeLabel);

        JTextField primeField = new JTextField();
        primeField.setEditable(false);
        frame.add(primeField);

        JButton checkButton = new JButton("Check");
        frame.add(checkButton);

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(numberField.getText());
                    if (isPrime(number)) {
                        primeField.setText("Yes");
                    } else {
                        primeField.setText("No");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input! Please enter a valid number.");
                }
            }
        });

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
