package com.yusuf.learning.java_interface;

public class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.println("*The rabbit is fleeing from the hawk*");
    }
}
