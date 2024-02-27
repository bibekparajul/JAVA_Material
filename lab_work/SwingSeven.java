import javax.swing.*;
import java.awt.*;

public class SwingSeven {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Scrollbar Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create a JTextArea with a lot of text to enable scrolling
        JTextArea textArea = new JTextArea(10, 20);
        for (int i = 0; i < 50; i++) {
            textArea.append("JAVA is an purely object oriented language and swing is used for creating GUI APP" + (i + 1) + "\n");
        }

        // Create a JScrollPane with horizontal and vertical scroll bars
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Add the JScrollPane to the JFrame
        frame.add(scrollPane);

        // Center the frame
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
