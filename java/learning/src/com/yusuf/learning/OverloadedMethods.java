package com.yusuf.learning;

public class OverloadedMethods {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different parameters
        //						method name + parameters = method signature

        //first overloaded method
        //int x = add(1,2);
        //second overloaded method
        //int x = add(1,2,3);
        //third overloaded method
        //int x = add(1,2,3, 4);

        //this is double
        double x = add(1.0,2.0,3.0, 4.0);

        System.out.println(x);
    }

    private static int add(int a, int b) {
        System.out.println("This is overloaded method number 1");
        return a + b;
    }

    private static int add(int a, int b, int c) {
        System.out.println("This is overloaded method number 2");
        return a + b + c;
    }

    private static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method number 3");
        return a + b + c + d;
    }

    private static double add(double a, double b) {
        System.out.println("This is overloaded method number 4");
        return a + b;
    }

    private static double add(double a, double b, double c) {
        System.out.println("This is overloaded method number 5");
        return a + b + c;
    }

    private static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method number 6");
        return a + b + c + d;
    }
}
