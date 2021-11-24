package learning.access_modifiers.package1;

import com.yusuf.learning.access_modifiers.package2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);

    }

}
