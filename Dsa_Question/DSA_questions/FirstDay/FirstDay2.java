package com.practice.DSA_questions.FirstDay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstDay2 {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<String>();

        cities.add("America");
        cities.add("Berlin");
        cities.add("Denmark");
        cities.add("Canada");
        cities.add("America");
        cities.add("France");
        cities.add("Denmark");
        cities.add("Europe");
        Iterator<String> itr=cities.iterator();

        while (itr.hasNext()){
            String element=(String) itr.next();
            System.out.println(element);

                //during iteration, we can not  modify the collection
            //it will throw [ConcurrentModificationException].

            //cities.add("hello");
            cities.remove(3);
           // System.out.println(cities);



        }
    }
}
