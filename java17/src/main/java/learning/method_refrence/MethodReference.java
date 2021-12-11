package learning.method_refrence;


import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodReference {
  private static final Logger logger = LoggerFactory.getLogger(MethodReference.class);

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
  private int operate(int a, int b, MethodReference.@NotNull FuncInter1 math) {
    return math.operation(a, b);
  }

  public static void main(String[] args) {
    logger.isInfoEnabled();
    MethodReference.FuncInter1 add = Integer::sum;

    MethodReference.FuncInter1 multiply = (int x, int y) -> x * y;

    MethodReference math = new MethodReference();

    logger.info("Addition is '{}'", math.operate(9, 10, add));

    logger.info("Multiplication is '{}'", math.operate(3, 6, multiply));

    MethodReference.FuncInter2 run = message -> logger.info("Hello '{}'", message);
    run.sayMessage("Yusuf");
  }
}
