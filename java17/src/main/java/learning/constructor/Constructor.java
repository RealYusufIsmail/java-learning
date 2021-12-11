package learning.constructor;

public class Constructor {
  public static void main(String[] args) {

    Human human1 = new Human("Yusuf", 14, 57.5, 5.3);
    Human human2 = new Human("Bob", 21, 65.5, 6.3);

    // System.out.println(human2.name);
    human1.eat(); // will print Yusuf is eating
    human2.drink(); // will print Bob is drinking
  }
}
