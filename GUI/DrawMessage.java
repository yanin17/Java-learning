package GUI;

import javax.swing.*;

public class DrawMessage extends JPanel {
    /* Main method */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new DrawMessage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    /* Paint the nessage */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("ยินดีต้อนรับสู่ ..", 40, 40);
    }
}
