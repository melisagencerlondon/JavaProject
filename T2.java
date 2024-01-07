package Java.javaquiz2;

public class T2 {
    //Find out how many alpha characters are present in a string?
    public static void main(String[] args) {
        String a = "Hello World, I love Java";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isLetter(ch)) {
                count++;
            }
        }

        System.out.println("Number of alpha characters: " + count);
    }
}
