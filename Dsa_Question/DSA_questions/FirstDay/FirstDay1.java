package com.practice.DSA_questions.FirstDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstDay1 {

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
        cities.add("France");
        cities.add("Bulandshahr");
        System.out.println(cities);

        // this is not correct way to print a sorted string..
     //  String sortedCity= collections.sort(cities);


        //this is working correctly
        //first we need to import the collections class

        Collections.sort(cities);
        System.out.println(cities);

        cities.add("Meerut");//we are able to add new city..
        System.out.println(cities);

        //if we make unmodifiableList then we can not add any city then
        //let's check

//                    List<String> unlist=Collections.unmodifiableList(cities);
//                     unlist.add("Mysore");
//                    System.out.println(cities);


        //..................now...

        List<String> sysnList=Collections.synchronizedList(cities);

        //now this is thread safe...
        //thread safe means multiple thread can not access is at the same time..
        //but this make system slow
        //so java launch another feature cuncurrentHashMap it is syan as well as faster..

        Collections.reverse(cities);
        System.out.println(cities);




   }
}
