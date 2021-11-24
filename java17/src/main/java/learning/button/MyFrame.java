package learning.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("src/com/yusuf/learning/button/logo.png");
        ImageIcon icon2 = new ImageIcon("src/com/yusuf/learning/button/logo-small.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,100);
        //button.addActionListener(e -> System.out.println("Lfc is the best team in the world."));
        button.addActionListener(this);
        button.setText("I am a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setFont(new Font("Comic Sans",Font.BOLD,10));
        button.setForeground(Color.magenta);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Lfc is the best team in the world.");
            label.setVisible(true);
        }
    }
}
