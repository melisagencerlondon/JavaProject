package Java.javaquiz2;

public class T4 {
    public static void main(String[] args) {
        //Check if a String is Palindrome: Determine whether a given string is a
        //palindrome, which means it reads the same forwards and backward. For
        //example, "madam" is a palindrome.
        String str = "Amma";
        String reverseWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverseWord)) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("Its not a Palindrome");

        }
    }
}

