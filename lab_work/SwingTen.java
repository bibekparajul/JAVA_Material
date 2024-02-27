import javax.swing.*;
import java.awt.*;

public class SwingTen {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Menus Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the main menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu runMenu = new JMenu("Run");
        JMenu sourceMenu = new JMenu("Source");
        JMenu refactorMenu = new JMenu("Refactor");
        JMenu navigateMenu = new JMenu("Navigate");
        JMenu searchMenu = new JMenu("Search");
        JMenu projectMenu = new JMenu("Project");
        JMenu windowMenu = new JMenu("Window");
        JMenu helpMenu = new JMenu("Help");

        // Add the main menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(runMenu);
        menuBar.add(sourceMenu);
        menuBar.add(refactorMenu);
        menuBar.add(navigateMenu);
        menuBar.add(searchMenu);
        menuBar.add(projectMenu);
        menuBar.add(windowMenu);
        menuBar.add(helpMenu);

        // Create menu items for Project menu
        JMenuItem openProjectItem = new JMenuItem("Open Project");
        JMenuItem closeProjectItem = new JMenuItem("Close Project");
        JMenuItem buildAllItem = new JMenuItem("Build All");
        JMenuItem buildProjectItem = new JMenuItem("Build Project");

        // Add menu items to Project menu
        projectMenu.add(openProjectItem);
        projectMenu.add(closeProjectItem);
        projectMenu.addSeparator();
        projectMenu.add(buildAllItem);
        projectMenu.add(buildProjectItem);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Center the frame
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
