package Java.javaquiz2;

import java.util.ArrayList;

public class T8 {
    public static void main(String[] args) {
        //You have a list of strings and you want to keep only those that start with
        //“A” and you want to return them in lower case".
        //String str=new String("Ahmed loves studiying Java with Syntax");
        //System.out.println(str.toLowerCase(),[^A]);
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Ahmed");
        stringList.add("Zainab");
        stringList.add("Mesut");
        stringList.add("Melisa");
        stringList.add("Fatma");
        for (String s : stringList) {
            if (s.startsWith("A")) {
                System.out.println(s.toLowerCase());
            }

        }
    }
}