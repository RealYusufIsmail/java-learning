package learning;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        // for-each = 	traversing technique to iterate through the elements in an array/collection
        //				less steps, more readable
        // 				less flexible

        //String[] animals = {"cat","parrot","mouse","cat","tiger"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("parrot");
        animals.add("mouse");
        animals.add("tiger");

        for(String i : animals) {
            System.out.println(i);
        }
    }
}
