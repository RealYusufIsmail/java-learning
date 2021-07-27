package com.yusuf.learning;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        // String = a reference data type that can store one or more characters
        //   reference data types have access to useful methods

        String name = "Yusuf";

        boolean result = name.equals("Yusuf");
        //this is case sensitive. if it is yusuf it will return false since the name = Yusuf. With a capital Y.

        //boolean result = name.equalsIgnoreCase("yusuf");
        //will say positive since it ignore if it is capital or not

        //int result = name.length();
        //will return the length of the name. Yusuf has a length of 5.

        //char result = name.charAt(4);
        //will print the letter at the given character. Yusuf has 5 character. The computer counts from 0.
        //So if you put 4 charAt. The 4 character is f. because Y = 0, u = 1, s = 2, u = 3, and f = 4.

        //int result = name.indexOf("Y");
        //will tell you what character number is for the given letter.

        //boolean result = name.isEmpty();
        //will tell us if the string is empty. It will return false.

        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //will change the string to all upper case. It is Vise versa for toLowerCase();

        //String result = name.trim();
        //will remove the empty space from the string

        //String result = name.replace('y','l');
        //will replace all the specified character to the new specified character.

        System.out.println(result);
    }
}
