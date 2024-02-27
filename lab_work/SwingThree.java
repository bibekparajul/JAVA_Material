import javax.swing.*;
import java.awt.*;

public class SwingThree {
    public static void main(String[] args) {
        // Set up the frame
        JFrame frame = new JFrame("Checkbox and Radio Button Example");
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create panel for components
        JPanel panel = new JPanel();
        JLabel lbl1 = new JLabel("Choose program to enroll");
        JLabel lbl2 = new JLabel("Payment");
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create checkboxes for subjects
        JCheckBox cCheckbox = new JCheckBox("C");
        JCheckBox javaCheckbox = new JCheckBox("Java");
        JCheckBox htmlCheckbox = new JCheckBox("HTML");
        JCheckBox phpCheckbox = new JCheckBox("PHP");

        // Add checkboxes to the panel
        panel.add(lbl1);
        panel.add(cCheckbox);
        panel.add(javaCheckbox);
        panel.add(htmlCheckbox);
        panel.add(phpCheckbox);

        // Create radio buttons
        JRadioButton now = new JRadioButton("Now");
        JRadioButton later = new JRadioButton("Later");

        // Group the radio buttons
        ButtonGroup paygroup = new ButtonGroup();
        paygroup.add(now);
        paygroup.add(later);

        // Add radio buttons to the panel
        panel.add(lbl2);
        panel.add(now);
        panel.add(later);

        // Add panel to the frame
        frame.add(panel, BorderLayout.WEST);

        // Center the frame
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
