package GUI;

import javax.swing.*;

public class DrawRectangle extends JFrame {
    public DrawRectangle(){
        setTitle("STOU");
        getContentPane().add(new RectPanel());
    }

    /*Main method */
    pu blic static void main(String[] args){
        DrawRectangle frame = new DrawRect angle();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setVisible(true);
    }
    


class RectPanel extends JPanel {
    protected void paintComponent(Graphics g){
        suoer.paintComponent(g);

        // Set new color
        g.setColor(Color.red);

        // Draw a rectangle
        g.drawRect(5, 5, getWidth()/2-10, getHeight()/2-10);

        // Draw a rounded rectangle
        g.drawRoundRect(getWidth()/2+5, 5, getWidth()/2-10, getHeight()/2-10, 60, 30);

        // Change the color to cyan
        g.setColor(Color.cyan);

        // Draw a 3D rectangle 
        g.fill3DRect(5, getHeight()/2+5, getWidth()/2-10, getHeight()/2-10, true);

        // Draw a raised 3D rectangle
        g.fill3DRect(5, getHeight()/2+5, getWidth()/2-10, getHeight()/2-10, false);
    }
}
