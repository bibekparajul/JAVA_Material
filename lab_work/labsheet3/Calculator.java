import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    private static JFrame frame;
    private static JTextField num1Field, num2Field, resultField;
    private static JButton addButton, subtractButton, multiplyButton, divideButton;

    public static void main(String[] args) {
        frame = new JFrame("Calculator");
        frame.setLayout(new GridLayout(5, 2));

        JLabel num1Label = new JLabel("Number 1:");
        frame.add(num1Label);

        num1Field = new JTextField();
        frame.add(num1Field);

        JLabel num2Label = new JLabel("Number 2:");
        frame.add(num2Label);

        num2Field = new JTextField();
        frame.add(num2Field);

        JLabel resultLabel = new JLabel("Result:");
        frame.add(resultLabel);

        resultField = new JTextField();
        resultField.setEditable(false);
        frame.add(resultField);

        addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation('+');
            }
        });
        frame.add(addButton);

        subtractButton = new JButton("-");
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation('-');
            }
        });
        frame.add(subtractButton);

        multiplyButton = new JButton("*");
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation('*');
            }
        });
        frame.add(multiplyButton);

        divideButton = new JButton("/");
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation('/');
            }
        });
        frame.add(divideButton);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static void performOperation(char operator) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(frame, "Error: Division by zero!");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid input! Please enter valid numbers.");
        }
    }
}
