package Java.javaquiz2;

import java.util.ArrayList;

public class T10 {
    public static void main(String[] args) {
        //How can you remove all duplicates from ArrayList?
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Kolkata");
        cityList.add("Chennai");
        cityList.add("Kolkata");
        cityList.add("Mumbai");

        ArrayList<String> newList = new ArrayList<>();
        for(String name : cityList){
            if(!newList.contains(name)){
                newList.add(name);
            }
        }

        for(String name : newList){
            System.out.println("City Name - " + name);
        }
    }
}