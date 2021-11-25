package learning.map_interface;

import learning.annotations.MadeBy;

import java.util.HashMap;
import java.util.Map;

@MadeBy(author = "Yusuf Arfan Ismail")
public class Mapping {
    public static void main(String[] args) {
        // Java program to demonstrate
        // the working of Map interface
        Map<String, Integer> days
                = new HashMap<>();

        days.put("Monday", 1);
        days.put("Tuesday", 2);
        days.put("Wednesday", 3);
        days.put("Thursday", 4);
        days.put("Friday", 5);
        days.put("Saturday", 6);
        days.put("Sunday", 7);

        Map<Integer, String> month
                = new HashMap<>();

        month.put(1, "January");
        month.put(2, "February");
        month.put(3, "March");
        month.put(4, "April");
        month.put(5, "May");
        month.put(6, "June");
        month.put(7, "July");
        month.put(8, "August");
        month.put(9, "September");
        month.put(10, "October");
        month.put(11, "November");
        month.put(12, "December");

        System.out.println("Days of week are: " + days);
        System.out.println("Months are: " + month);
    }
}
