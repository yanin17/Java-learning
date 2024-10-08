package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class ShowFlowLayout extends JFrame {
    public ShowFlowLayout() {
        // Get the content pane of the frame
        Container container = getContentPane();

        // Set FlowLayout, aligned left with horizontal gap 10
        // and vertical gap 20 between component
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        // Add buttons to the frame
        for (int i; i <= 10; i++)
            container.add(new JButton("ปุ่ม" + i));
    }

    /* Main method */
    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle("STOU");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
