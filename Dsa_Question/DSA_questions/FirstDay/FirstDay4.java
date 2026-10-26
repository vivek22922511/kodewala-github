package com.practice.DSA_questions.FirstDay;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FirstDay4 {
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
        ListIterator<String> itr = cities.listIterator();

        while (itr.hasNext()) {

            String element =  itr.next();
            if(itr.hasNext()){
                String prevElement=itr.previous();
                System.out.println(prevElement);
                break;
            }
        }
    }
}

