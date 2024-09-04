package GUI;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class ShowInternalFrame {
    private JMenuBar jMeneBar1 = new JMenuBar();
    private JMenuItem jmiUS = new JMenuItem("US");
    private JMenuItem jmiCanada-new JMenuItem("Canada");
    private ImageViewer imageViewer = new ImageViewer();

    // Create DesktopPane to hold the internal frame
    private JDesktopPane desktop = new JDesktopPane();
    private JInternalFrame internalFrame = new JInternalFrame(
            "US", true, true, true, true);

    // Create images
    private Image ImageUS = ImageViewer.createImage("image/us.gif", this);
    private Image ImageCanada = ImageViewer.createImage("image/ca.gif", this);

    // Create image icons
    private ImageIcon imageUSIcon = ImageViewer.createImageIcon("image/usIcon.gif", this);
    private ImageIcon imageCanadaIcon = ImageViewer.createImageIcon("image/caIcon.gif", this);

    public ShowInternalFrame(){
        desktop.add(internalFrame);

        this.setSize(new Dimension(400,300));
        this.getContentPane().add(desktop, BorderLayout.CENTER);

        imageViewer.setImage(imageUS);
        internalFrame.setFrameIcon(imageUSIcon);

        internalFrame.getContentPane().add(imageViewer);
        internalFrame.setLocale(20, 20);
        internalFrame.setSize(100, 100);
        internalFrame.setVisible(true);

        JMenu jMenu1 = new JMenu("Flags");
        jMenuBar1.add(jMenu1);
        jMenu1.add(jmiUs);
        jMenu1.add(jmiCanada);

        this.setJMenuBar(jMenuBar1);

        jmiUS.addActionListener(new ActionListener()){

    public void actionPerformed(ActionEvent e){
                imageViewer.setImage(ImageUS);
                internalFrame.setFrameIcon(imageUSIcon);
                internalFrame.setTitle("US");
            }
        }

        jmiCanada.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                imageViewer.setImage(ImageCanada);
                internalFrame.setFrameIcon(imageCanadaIcon);
                internalFrame.setTitle("Canada");
            }
        });

    }
}
