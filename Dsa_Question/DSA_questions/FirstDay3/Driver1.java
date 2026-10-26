package com.practice.DSA_questions.FirstDay3;

import java.util.Set;
import java.util.TreeSet;

public class Driver1 {
    public static void main(String[] args) {

       // Set<Integer> set1= new LinkedHashSet<>();
// LinkedHashSet  stored  unique as well as ordered manner....


        Set<Integer> set1= new TreeSet<>();
        //TreeSet Stored unique as well as sorted manner
        set1.add(10);
        set1.add(20);
        set1.add(40);
        set1.add(30);
        set1.add(20);
        set1.add(60);
        set1.add(50);
        set1.add(30);

        System.out.println(set1);
    }
}
