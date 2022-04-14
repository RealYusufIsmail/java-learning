package learning.lambda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger log = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {

    /*
     * lambda expression = feature for Java 8 and above also known as an anonymous method a shorter
     * way to write anonymous classes with only one method
     *
     * need to use a functional interface or use a pre-defined functional interface they contain
     * only one abstract method ex. ActionListener, Runnable, (user-defined)
     *
     * A Lambda expression can be used in any place where a functional interface is required How to
     * use a lambda expression: (arguments) -> {statement/s}
     */
    /*
     * ``` var name = "Yusuf"; var symbol = '!';
     * 
     * LambdaExpressions lambda = (x, y) -> { log.info("Hello " + x + y);
     * log.info("It's a nice day"); };
     * 
     * LambdaExpressions lambda2 = (x, y) -> log.info("Hello " + x + y);
     * 
     * lambda.print(name, symbol); lambda2.print(name, symbol); } ```
     */

    MyFrame myFrame = new MyFrame();
  }
}
