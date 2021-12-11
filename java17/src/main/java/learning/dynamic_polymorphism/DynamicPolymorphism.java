package learning.dynamic_polymorphism;

import java.util.Scanner;

public class DynamicPolymorphism {
  public static void main(String[] args) {
    // ALSO KNOWN AS RUNTIME POLYMORPHISM
    // dynamic = after compilation

    Scanner scanner = new Scanner(System.in);
    Animal animal;
    System.out.println("What animal do you want");
    System.out.print("(1 = cat) or (2 = parrot): ");
    int choice = scanner.nextInt();

    if (choice == 1) {
      animal = new Cat();
      animal.speak();
    } else if (choice == 2) {
      animal = new Parrot();
      animal.speak();
    } else {
      animal = new Animal();
      System.out.println("Error. You have entered an invalid input");
      animal.speak();
    }
  }
}
