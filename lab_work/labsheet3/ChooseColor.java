import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChooseColor {
    private static JPanel colorPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel to display color
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        frame.add(colorPanel, BorderLayout.CENTER);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Buttons to change color
        JButton redButton = new JButton("Red");
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.RED);
            }
        });
        buttonPanel.add(redButton);

        JButton blueButton = new JButton("Blue");
        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.BLUE);
            }
        });
        buttonPanel.add(blueButton);

        JButton greenButton = new JButton("Green");
        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.GREEN);
            }
        });
        buttonPanel.add(greenButton);

        // Close button
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonPanel.add(closeButton);

        frame.add(buttonPanel, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
