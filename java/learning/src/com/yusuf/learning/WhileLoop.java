package com.yusuf.learning;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as a it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        /*
        while(name.isEmpty()) {
            //isBlank is not in java8 so i am using isEmpty instead.
            System.out.println("Enter your name");
            name = scanner.nextLine();
        }
         */
         do{
            //isBlank is not in java8 so i am using isEmpty instead.
            System.out.println("Enter your name");
            name = scanner.nextLine();
        }while(name.isEmpty());
        //the code will execute continuously until they give there name
        System.out.println("Hello " + name);
    }
}
