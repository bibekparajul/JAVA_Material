import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter");
        frame.setLayout(new GridLayout(4, 2));

        JLabel dollarLabel = new JLabel("Dollar:");
        frame.add(dollarLabel);

        JTextField dollarField = new JTextField();
        frame.add(dollarField);

        JLabel nepaleseLabel = new JLabel("Nepalese:");
        frame.add(nepaleseLabel);

        JTextField nepaleseField = new JTextField();
        nepaleseField.setEditable(false);
        frame.add(nepaleseField);

        JLabel euroLabel = new JLabel("Euro:");
        frame.add(euroLabel);

        JTextField euroField = new JTextField();
        euroField.setEditable(false);
        frame.add(euroField);

        dollarField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double dollar = Double.parseDouble(dollarField.getText());
                    double nepalese = dollar * 132; // Conversion rate: 1 USD = 118.34 NPR
                    double euro = dollar * 0.92; // Conversion rate: 1 USD = 0.85 EUR
                    nepaleseField.setText(String.format("%.2f", nepalese));
                    euroField.setText(String.format("%.2f", euro));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input! Please enter a valid number.");
                }
            }
        });

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
