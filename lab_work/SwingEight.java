import javax.swing.*;
import java.awt.*;

public class SwingEight {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create the first number text field
        JTextField num1Field = new JTextField(10);

        // Create the second number text field
        JTextField num2Field = new JTextField(10);

        // Create the label for the result
        JLabel resultLabel = new JLabel("Result: ");
        JTextField resuTextField = new JTextField(10);


        // Create the addition button
        JButton addButton = new JButton("+");

        // Create the subtraction button
        JButton subButton = new JButton("-");

        // Create panel for components
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("First Number: "));
        panel.add(num1Field);
        panel.add(new JLabel("Second Number: "));
        panel.add(num2Field);
        panel.add(resultLabel);
        panel.add(resuTextField);
        panel.add(addButton);
        panel.add(subButton);


        // Add panel to the frame
        frame.add(panel);

        // Center the frame
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
