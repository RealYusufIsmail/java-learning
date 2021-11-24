package learning.jfram_gui;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to

        /*
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("Gui"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application.
        //frame.setResizable(false); //prevent frame from being resized.
        frame.setResizable(true); //allows frame from being resized.
        frame.setSize(420,420); //sets x-dimension and y-dimension.
        frame.setVisible(true); //makes frame visible

        ImageIcon icon = new ImageIcon("com/yusuf/learning/jfram_gui/GUI.java");
        //will create an image icon ^.
        frame.setIconImage(icon.getImage()); //change icon of frame.
        //frame.getContentPane().setBackground(Color.cyan); //change color of background.
        frame.getContentPane().setBackground(new Color(0x87ceeb)); //change color of background.
         */

        new MyFrame(); // will do the same thing as ^
    }
}
