package learning.access_modifiers.package1;

import learning.access_modifiers.package2.C;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);

    }

}
