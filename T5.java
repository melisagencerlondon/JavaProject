package Java.javaquiz2;

import java.util.Arrays;

public class T5 {
    public static void main(String[] args) {
        //Check if Two Strings are Anagrams: Given two strings, determine if they
        //are anagrams, meaning they contain the same characters in a different order.
        //For example, "listen" and "silent" are anagrams.
        String str1 = "yummy";
        String str2 = "mummy";
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean result = Arrays.equals(a, b);
        if (result == true) {
            System.out.println("It is Anagram");
        } else {
            System.out.println("it is not Anagram");
        }
    }
}


