package learning.panels;

import javax.swing.*;
import java.awt.*;

public class Panel {
  public static void main(String[] args) {
    // JPanel = a GUI component that functions as a container to hold other components

    JLabel label = new JLabel();
    label.setText("Salam");
    label.setVerticalAlignment(JLabel.TOP);
    label.setHorizontalAlignment(JLabel.RIGHT);
    label.setBounds(0, 0, 75, 75);

    JPanel cyanPanel = new JPanel();
    cyanPanel.setBackground(Color.cyan);
    cyanPanel.setBounds(0, 0, 250, 250);

    JPanel greenPanel = new JPanel();
    greenPanel.setBackground(Color.green);
    greenPanel.setBounds(250, 0, 250, 250);

    JPanel redPanel = new JPanel();
    redPanel.setBackground(Color.red);
    redPanel.setBounds(0, 250, 500, 250);
    redPanel.setLayout(new BorderLayout());

    JFrame frame = new JFrame(); // creates a frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application.
    frame.setLayout(null);
    frame.setSize(750, 750); // sets x-dimension and y-dimension.
    redPanel.add(label);
    frame.add(cyanPanel);
    frame.add(greenPanel);
    frame.add(redPanel);
    frame.setVisible(true); // makes frame visible
  }
}
