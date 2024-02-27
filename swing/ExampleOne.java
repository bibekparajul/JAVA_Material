import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleOne {

    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel (container)
        JPanel panel = new JPanel();

        // Create a JLabel (text label)
        JLabel label = new JLabel("Hello, Swing!");

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change the label text when the button is clicked
                label.setText("Button Clicked!");
            }
        });

        // Add components to the panel
        panel.add(label);
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}
