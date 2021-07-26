package com.yusuf.learning;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as a it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.println("Enter your name");
            name = scanner.nextLine();
        }
        //the code will execute continuously until they give there name
        System.out.println("Hello " + name);
    }
}
