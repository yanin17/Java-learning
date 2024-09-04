package GUI;

import java.awt.Container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowBorderLayout extends JFrame {
    public ShowBorderLayout() {
        // Get the content pane of the frame
        Container container = getContentPane();

        // Set BorderLayout with horizontaly agp 5
        // and vertically 10
        container.setLayout(new BorderLayout(5, 10));

        // Add buttons to the frame
        container.add(new JButton("ตะวันออก"), BorderLayout.EAST);
        container.add(new JButton("ใต้"), BorderLayout.SOUTH);
        container.add(new JButton("ตะวันตก"), BorderLayout.WEST);
        container.add(new JButton("เหนือ"), BorderLayout.NORTH);
        container.add(new JButton("กลาง"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        ShowBorderLayout frame = new ShowBorderLayout();
        frame.setTitle("STOU");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

}
