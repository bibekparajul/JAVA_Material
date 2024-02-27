import javax.swing.*;
import java.awt.*;

public class SwingOne {
    public static void main(String[] args) {
        // Set up the frame
        JFrame frame = new JFrame("Swing One");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 5, 5)); // 3 rows, 2 columns, with gaps

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JLabel addressLabel = new JLabel("Address:");
        JTextField nameTextField = new JTextField();
        JTextField addressTextField = new JTextField();
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        // Set alignment of labels to center
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        addressLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Change the text of nameLabel to "Full Name"
        nameLabel.setText("Full Name");

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameTextField);
        frame.add(addressLabel);
        frame.add(addressTextField);
        frame.add(okButton);
        frame.add(cancelButton);

        // Center the frame
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
