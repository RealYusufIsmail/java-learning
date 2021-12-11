package learning;

public class PrintF {
  public static void main(String[] args) {
    // printf() = an optional method to control, format, and display text to the console window
    // two arguments = format string + (object/variable/value)
    // % [flags] [precision] [width] [conversion-character]

    // %d will print out 123. This is the result "123 This is a format String".
    // System.out.printf("%d This is a format String", 123);

    boolean myBoolean = true;
    char myChar = '&';
    String myString = "Yusuf";
    int myInt = 15;
    double myDouble = 21000;

    // [conversion-character]
    // will display true
    // System.out.printf("%b", myBoolean);

    // will display &.
    // System.out.printf("%c", myChar);

    // will display Yusuf.
    // System.out.printf("%s", myString);

    // will display 15.
    // System.out.printf("%d", myInt);

    // will display 21000.
    // System.out.printf("%f", myDouble);

    // s for String, b for Boolean, c for Char, d for Int and f for double


    // [width]
    // minimum number of characters to be written as output
    // System.out.printf("Hello %10s",myString);

    // [precision]
    // sets number of digits of precision when outputting floating-point values
    // System.out.printf("You have this much money %.1f",myDouble);

    // [flags]
    // adds an effect to output based on the flag added to format specifier
    // - : left-justify
    // + : output a plus ( + ) or minus ( - ) sign for a numeric value
    // 0 : numeric values are zero-padded
    // , : comma grouping separator if numbers > 1000

    // System.out.printf("You have this much money %,f",myDouble);
  }
}
