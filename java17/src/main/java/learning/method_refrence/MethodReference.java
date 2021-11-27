package learning.method_refrence;

import org.jetbrains.annotations.NotNull;

public class MethodReference {
    // operation is implemented using lambda expressions
    interface FuncInter1
    {
        int operation(int a, int b);
    }

    // sayMessage() is implemented using lambda expressions
    // above
    interface FuncInter2
    {
        void sayMessage(String message);
    }

    // Performs FuncInter1's operation on 'a' and 'b'
    private int operate(int a, int b, MethodReference.@NotNull FuncInter1 fobj)
    {
        return fobj.operation(a, b);
    }
    public static void main(String[] args) {
        MethodReference.FuncInter1 add = Integer::sum;

        MethodReference.FuncInter1 multiply = (int x, int y) -> x * y;

        MethodReference tobj = new MethodReference();

        System.out.println("Addition is " +
                tobj.operate(9, 10, add));

        System.out.println("Multiplication is " +
                tobj.operate(3, 6, multiply));

        MethodReference.FuncInter2 fobj = message -> System.out.println("Hello "
                + message);
        fobj.sayMessage("Yusuf");
    }
}
