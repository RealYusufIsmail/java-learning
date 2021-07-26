package com.yusuf.learning;

import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter thy name;");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter thy age")); //use this when you are using an integer(int).
        JOptionPane.showMessageDialog(null, "Thy is " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter thy height in cm")); //use this when you are using an double.
        JOptionPane.showMessageDialog(null, "Thy is " + height + " cm tall");

    }
}
