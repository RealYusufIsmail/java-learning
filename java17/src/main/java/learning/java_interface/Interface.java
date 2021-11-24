package learning.java_interface;

public class Interface {
    public static void main(String[] args) {
        //Interface = a template that can be applied to a class.
        //They can apply more than one e.g public class Fish implements Prey, Predator

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        //hawk.hunt();
        //rabbit.flee();
        fish.hunt();
        fish.flee();
    }
}
