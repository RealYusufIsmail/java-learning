package learning.overloaded_constructors;

public class Pizza {
    String bread;
    String oil;
    String cheese;
    String sauce;
    String toppings;

    Pizza(String bread, String oil, String cheese,  String sauce,  String toppings) {
            this.bread = bread;
            this.oil = oil;
            this.cheese = cheese;
            this.sauce = sauce;
            this.toppings = toppings;
    }

    Pizza(String bread, String oil, String cheese,  String sauce) {
        this.bread = bread;
        this.oil = oil;
        this.cheese = cheese;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    Pizza(String bread, String cheese, String sauce) {
        this.bread = bread;
        this.oil = oil;
        this.cheese = cheese;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.oil = oil;
        this.cheese = cheese;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    Pizza(String bread) {
        this.bread = bread;
        this.oil = oil;
        this.cheese = cheese;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    Pizza() {
        this.bread = bread;
        this.oil = oil;
        this.cheese = cheese;
        this.sauce = sauce;
        this.toppings = toppings;
    }
}
