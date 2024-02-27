import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SwingSix {
    public static void main(String[] args) {
        // List of sports
        String[] sports = {"Badminton", "Hokey", "Tennis", "Football", "Cricket", "Formula One", "Rugby"};

        // Create the frame
        JFrame frame = new JFrame("Sports Selection");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create label
        JLabel label = new JLabel("Select your favorite sports from the list:");

        // Create list
        JList<String> sportsList = new JList<>(sports);
        sportsList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(sportsList);

        // Add listener to the list
        sportsList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    Object[] selectedSports = sportsList.getSelectedValues();
                    System.out.print("Selected sports: ");
                    for (Object sport : selectedSports) {
                        System.out.print(sport + " ");
                    }
                    System.out.println();
                }
            }
        });

        // Create panel for components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.WEST);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Center the frame
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
