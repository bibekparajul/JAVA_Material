import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SwingTwelve {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Dialog Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create button for Dialog Box
        JButton dialogButton = new JButton("Show Dialog Box");
        dialogButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "This is a Dialog Box!", "Dialog Box", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Create button for File Dialog
        JButton fileDialogButton = new JButton("Show File Dialog");
        fileDialogButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(frame);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(frame, "You selected file: " + selectedFile.getName(), "File Selected", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Add buttons to the frame
        frame.add(dialogButton);
        frame.add(fileDialogButton);

        // Center the frame
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
