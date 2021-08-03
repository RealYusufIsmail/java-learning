package com.yusuf.learning.javainterface;

public class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.println("*The rabbit is fleeing from the hawk*");
    }
}
