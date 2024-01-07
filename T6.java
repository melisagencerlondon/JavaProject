package Java.javaquiz2;

public class T6 {
    public static void main(String[] args) {
        //Create a method to count how many vowels are present in a string
        //“documentation”
        String input = "documentation";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in \"" + input + "\": " + vowelCount);
    }

    static int countVowels(String str) {
        return (int) str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }
}
