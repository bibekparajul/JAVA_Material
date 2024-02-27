import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event");
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Welcome to MouseEvent Demo");
        frame.add(button);
        
        JLabel clickCountLabel = new JLabel("Mouse Clicked: 0");
        frame.add(clickCountLabel);

        button.addMouseListener(new MouseListener() {
            private int clickCount = 0;

            public void mouseClicked(MouseEvent e) {
                clickCount++;
                clickCountLabel.setText("Mouse Click Count: " + clickCount);
            }

            // These methods are required by the MouseListener interface but are not used in this example
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
