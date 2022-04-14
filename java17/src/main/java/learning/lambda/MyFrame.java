package learning.lambda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class MyFrame extends JFrame {
  private static final Logger log = LoggerFactory.getLogger(MyFrame.class);

  JButton button = new JButton("Click me");
  JButton button2 = new JButton("Click me 2");


  MyFrame() {
    button.setBounds(100, 100, 200, 100);
    button.addActionListener(e -> log.info("Button clicked"));
    button2.setBounds(100, 200, 200, 100);
    button2.addActionListener(e -> log.info("Button 2 clicked"));

    this.add(button);
    this.add(button2);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setSize(420, 420);
    this.setLayout(null);
    this.setVisible(true);
  }
}
