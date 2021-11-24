package learning.jfram_gui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("Gui"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application.
        //frame.setResizable(false); //prevent frame from being resized.
        this.setResizable(true); //allows frame from being resized.
        this.setSize(420,420); //sets x-dimension and y-dimension.
        this.setVisible(true); //makes frame visible

        ImageIcon icon = new ImageIcon("com/yusuf/learning/jfram_gui/GUI.java");
        //will create an image icon ^.
        this.setIconImage(icon.getImage()); //change icon of frame.
        //frame.getContentPane().setBackground(Color.cyan); //change color of background.
        this.getContentPane().setBackground(new Color(0x87ceeb)); //change color of background.
    }
}
