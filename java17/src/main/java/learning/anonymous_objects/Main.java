package learning.anonymous_objects;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Anonymous objects are objects that are not named.
    // They are created at runtime.
    // They are used to implement the Runnable interface.
    JFrame frame = new JFrame();
    ArrayList<JLabel> labels = new ArrayList<>();

    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(420, 420);
    frame.setLayout(new FlowLayout());
    frame.setVisible(true);
  }
}
