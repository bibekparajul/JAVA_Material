import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayValue {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Display Value");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create TextField
        JTextField textField = new JTextField(20);
        frame.add(textField);

        JButton button = new JButton("Submit");

        // Create Label
        JLabel displayLabel = new JLabel();
        frame.add(displayLabel);

        // Create Button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                displayLabel.setText("Value: " + text);
            }
        });
        frame.add(button);

        // Set frame properties
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
