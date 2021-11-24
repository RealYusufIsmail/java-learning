package learning;

public class ReturnMethods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon

        int x = 4;
        int y = 3;

        //this is a local variable
        //int z = add(x,y);

        //another way to do it
        System.out.println(add(x,y));
    }

    public static int add(int x, int y) {
        int z = x + y;
        return z;
    }
}
