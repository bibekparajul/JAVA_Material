import javax.swing.*;
import java.awt.*;

public class SwingTwo {
    public static void main(String[] args) {
        // Set up the frame
        JFrame frame = new JFrame("Swing Two");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2, 5, 5)); // 2 rows, 2 columns, with gaps

        // Create buttons
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        // Disable buttons 2 and 4
        button2.setEnabled(false);
        button4.setEnabled(false);

        // Change labels of buttons 1 and 3
        button1.setText("one");
        button3.setText("three");

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        // Center the frame
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
