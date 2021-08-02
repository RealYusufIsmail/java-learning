package com.yusuf.learning.accessmodifiers.package1;

import com.yusuf.learning.accessmodifiers.package2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);

    }

}
