package com.practice.DSA_questions.FirstDay;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class firstDay3 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> cities = new CopyOnWriteArrayList<String>();

        cities.add("America");
        cities.add("Berlin");
        cities.add("Denmark");
        cities.add("Canada");
        cities.add("America");
        cities.add("France");
        cities.add("Denmark");
        cities.add("Europe");
//        Iterator<String> itr = cities.iterator();
        Iterator<String> itr = cities.iterator();

        while (itr.hasNext()) {
            String element = (String) itr.next();
            System.out.println(element);

//            if (element.equalsIgnoreCase("Europe")){
//                System.out.println("it's removing the element");
//               cities.remove(2);

 //           }
            //now it is removing..
            itr.remove();
        }
    }
}