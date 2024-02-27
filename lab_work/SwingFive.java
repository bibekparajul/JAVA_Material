import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SwingFive {
    public static void main(String[] args) {
        // List of planets
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

        // Create the frame
        JFrame frame = new JFrame("List Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create label
        JLabel label = new JLabel("Choose the planet:");

        // Create list
        JList<String> planetList = new JList<>(planets);
        planetList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(planetList);

        // Add listener to the list
        planetList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    String selectedPlanet = planetList.getSelectedValue();
                    System.out.println("Selected planet: " + selectedPlanet);
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
