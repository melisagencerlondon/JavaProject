package Java.javaquiz2;

public class T1 {
    //Write a program to swap 2 String without a temporary variable?
    public static void main(String[] args) {
        String x = "Hello";
        String y = "World";
        x = x + y;
        y = x.substring(0, x.length() - y.length());
        x = x.substring(y.length());

        System.out.println("After swapping:");
        System.out.println("a: " + x);
        System.out.println("b: " + y);

    }
}
