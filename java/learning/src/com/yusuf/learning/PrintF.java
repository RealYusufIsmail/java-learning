package com.yusuf.learning;

public class PrintF {
    public static void main(String[] args) {
        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]

        //%d will print out 123. This is the result "123 This is a format String".
        //System.out.printf("%d This is a format String", 123);

        boolean myBoolean = true;
        char myChar = '&';
        String myName = "Yusuf";
        int myNumber = 15;
        double myDouble = 21000;

        //will display true
        //System.out.printf("%b", myBoolean);

        //will display &
        System.out.printf("%c", myChar);
    }
}
