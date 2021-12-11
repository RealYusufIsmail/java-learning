package learning.lambda;

// Java program to demonstrate lambda expressions
// to implement a user defined functional interface.

import java.util.ArrayList;

// A sample functional interface (An interface with
// single abstract method
interface LambdaExpressions {
  // An abstract function
  void abstractFun(int x);

  // A non-abstract (or default) function
  default void normalFun() {
    System.out.println("Hello");
  }
}


class Test {
  public static void main(String[] args) {
    // lambda expression to implement above
    // functional interface. This interface
    // by default implements abstractFun()
    LambdaExpressions fobj = (int x) -> System.out.println(2 * x);

    // This calls above lambda expression and prints 10.
    fobj.abstractFun(5);
  }
}


class TestTwo {
  public static void main(String[] args) {
    // Creating an ArrayList with elements
    // {1, 2, 3, 4}
    ArrayList<Integer> arrL = new ArrayList<>();
    arrL.add(1);
    arrL.add(2);
    arrL.add(3);
    arrL.add(4);

    // Using lambda expression to print all elements
    // of arrL
    arrL.forEach(n -> System.out.println(n));

    // Using lambda expression to print even elements
    // of arrL
    arrL.forEach(n -> {
      if (n % 2 == 0)
        System.out.println(n);
    });
  }
}


// Java program to demonstrate working of lambda expressions
class TestThree {
  // operation is implemented using lambda expressions
  interface FuncInter1 {
    int operation(int a, int b);
  }

  // sayMessage() is implemented using lambda expressions
  // above
  interface FuncInter2 {
    void sayMessage(String message);
  }

  // Performs FuncInter1's operation on 'a' and 'b'
  private int operate(int a, int b, FuncInter1 fobj) {
    return fobj.operation(a, b);
  }

  public static void main(String[] args) {
    // lambda expression for addition for two parameters
    // data type for x and y is optional.
    // This expression implements 'FuncInter1' interface
    FuncInter1 add = (int x, int y) -> x + y;

    // lambda expression multiplication for two parameters
    // This expression also implements 'FuncInter1' interface
    FuncInter1 multiply = (int x, int y) -> x * y;

    // Creating an object of Test to call operate using
    // different implementations using lambda Expressions
    TestThree tobj = new TestThree();

    // Add two numbers using lambda expression
    System.out.println("Addition is " + tobj.operate(6, 3, add));

    // Multiply two numbers using lambda expression
    System.out.println("Multiplication is " + tobj.operate(6, 3, multiply));

    // lambda expression for single parameter
    // This expression implements 'FuncInter2' interface
    FuncInter2 fobj = message -> System.out.println("Hello " + message);
    fobj.sayMessage("Yusuf");
  }
}


