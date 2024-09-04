package GUI;

import javax.swing.JButton;

public class MyFrameWithComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("STOU");

        // Add a button into the frame
        java.awt.Container container = frame.getContentPane();
        JButton jbtOK = new JButton("OK");
        container.add(jbtOK);
    }
}
