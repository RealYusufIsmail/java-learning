package learning.constructor;

public class Human {

    String name;
    int age;
    double weight;
    double height;

    Human(String name, int age, double weight, double height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;

    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }

    public void drink() {
        System.out.println(this.name + " is drinking");
    }

}
