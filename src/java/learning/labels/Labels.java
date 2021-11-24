package com.yusuf.learning.labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("/Users/YusufIsmail/Documents/GitHub/java8-learning/java/learning/src/com/yusuf/learning/labels/logo.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); //will create a label
        label.setText("Yusuf, do you even code"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.cyan);
        label.setFont(new Font("Arial", Font.BOLD, 50));
        label.setIconTextGap(-25); //set gap of text to image.
        label.setBackground(Color.darkGray);
        label.setOpaque(true); //displays background colour
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon + text within label.
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon + text within label.
        //label.setBounds(100,100,250,250); //set x and y position within frame.

        JFrame frame = new JFrame(); //creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application.
        //frame.setSize(500,500); //sets x-dimension and y-dimension.
        //frame.setLayout(null);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);//makes frame visible
    }
}
