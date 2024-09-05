package GUI;

import java.awt.*;
import javax.swing.*;

public class TestPanels extends JFrame {
    public TestPanels() {
        // Get the content pane of the frame
        Container container = getContentPane();

        // Set BorderLayout for frame
        container.setLayout((new BorderLayout()));

        // Create panel p1 for the buttons and set GridLayout
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));

        // Add button to the panel
        for (int i = 1; i <= 9; i++) {
            p1.add(new JButton("" + i));
        }

        p1.add(new Button("" + 0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));

        // Create panel p2 to hold a text field and p1
        JPanel p2 = new JPanel();
        p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        // Add contents to the frame
        add(p2, BorderLayout.EAST);
        add(new JButton("Food to be placed here"), BorderLayout.CENTER);

    }

    /** main method */
    public static void main(String[] args) {
        TestPanels frame = new TestPanels();
        frame.setTitle("The front View of a Microwave Oven");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setVisible(true);
    }
}
