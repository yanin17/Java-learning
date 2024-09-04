package GUI;

import java.awt.Container;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowGridLayout extends JFrame {
    public ShowGridLayout() {
        // Get the content pane of the frame
        Container container = getContentPane();

        // Set GridLayout 4 rows 3 columns and gaps 5 between
        // components horizontally and vertically
        container.setLayout(new GridLayout(4, 3, 5, 5));

        // Add buttons to the frame
        for (int i = 1; i <= 12; i++)
            container.add(new JButton("ปุ่ม" + i));
    }

    public static void main(String[] args) {
        ShowGridLayout frame = new ShowGridLayout();
        frame.setTitle("STOU");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

}
