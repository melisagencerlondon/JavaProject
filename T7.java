package Java.javaquiz2;

public class T7 {
    public static void main(String[] args) {
        //Count the Number of Words in a String: Write a function to count the
        //number of words in a given string. Words are separated by spaces or
        //punctuation. For example, the input "Hello, world!" should return 2.
        String input = "Hello, Batch 18. how are you?!";
        System.out.println(input.split("[ ]").length);

    }
}
