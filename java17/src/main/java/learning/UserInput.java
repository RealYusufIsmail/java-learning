package learning;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is thy name?");
        String name = scanner.nextLine();
        System.out.println("Whats is thy age");
        int age = scanner.nextInt();
        scanner.nextLine(); //Use this when you use nextInt if you are going to use nextLine after.
        System.out.println("What is thy favourite food");
        String food = scanner.nextLine();

        System.out.println("Salam " + name);
        System.out.println("Thy is " + age + " years old");
        System.out.println("Thy likes " + food);
    }
}
