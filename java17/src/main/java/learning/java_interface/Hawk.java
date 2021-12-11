package learning.java_interface;

public class Hawk implements Predator {
  @Override
  public void hunt() {
    System.out.println("*The hawk is hunting*");
  }
}
