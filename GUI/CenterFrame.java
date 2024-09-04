package GUI;

import javax.swing.*;
import java.awt.*;

public class CenterFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("STOU");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Get the dimension of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Locate the upper-left corner (x,y) of the centered frame
        int x, y;
        x = (screenWidth - frame.getWidth()) / 2;
        y = (screenWidth - frame.getHeight()) / 2;

        // Set the location of the frame
        frame.setLocation(x, y);
        frame.setVisble(true);
    }
}
