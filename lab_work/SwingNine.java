import javax.swing.*;
import java.awt.*;

public class SwingNine {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("TextArea Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the label for control
        JLabel controlLabel = new JLabel("Control in action: TextArea");
        frame.add(controlLabel, BorderLayout.NORTH); // Add to NORTH

        // Create the JTextArea
        JTextArea textArea = new JTextArea(5, 10); // 5 rows, 10 columns

        // Create the label for comments
        JLabel commentLabel = new JLabel("Comments:");

        // Create button
        JButton showButton = new JButton("Show");

        // Create panel for components
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(commentLabel);
        panel.add(textArea);
        panel.add(showButton);

        // Add panel to the frame
        frame.add(panel, BorderLayout.CENTER); // Add to CENTER

        // Center the frame
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
