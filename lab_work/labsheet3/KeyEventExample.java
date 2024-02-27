import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Event ");
        frame.setLayout(new FlowLayout());

        JLabel enterTextLabel = new JLabel("Enter Text:");
        frame.add(enterTextLabel);

        JTextField textField = new JTextField(20);
        frame.add(textField);

        JLabel resultLabel = new JLabel("Result:");
        frame.add(resultLabel);

        textField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String text = textField.getText();
                resultLabel.setText("Result: " + text);
            }
        });

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
