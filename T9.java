package Java.javaquiz2;

public class T9 {
    //Find the First Non-Repeating Character in a String: Given a string, find and
//return the first non-repeating character. For example, in the string
//"abracadabra", the first non-repeating character is 'c'.
    public static void main(String[] args) {
        String x = "abracadabra";
        for (int i = 0; i < x.length(); i++) {
            if (x.indexOf(x.charAt(i), x.indexOf(x.charAt(i)) + 1) == -1) {
                System.out.println("First non repeating careacter is " + x.charAt(i));
                break;
            }
        }
    }
}
