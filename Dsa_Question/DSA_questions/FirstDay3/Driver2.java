package com.practice.DSA_questions.FirstDay3;

import java.util.Set;
import java.util.TreeSet;

public class Driver2 {
    public static void main(String[] args) {

        Set<Integer> set1= new TreeSet<>();

        Set<Integer> set2= new TreeSet<>();
        //TreeSet Stored unique as well as sorted manner
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        set2.add(10);
        set2.add(20);
        set2.add(40);
        set2.add(50);

//        System.out.println(set2.addAll(set1));
//        System.out.println(set2.removeAll(set1));
          System.out.println(set2.containsAll(set1));

                System.out.println(set2);
    }
}


