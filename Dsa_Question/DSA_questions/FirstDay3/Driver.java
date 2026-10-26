package com.practice.DSA_questions.FirstDay3;

import java.util.HashSet;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println(set1);
        set1.retainAll(set2);//it will check both set & return common value
        System.out.println(set1);

        System.out.println(set1.containsAll(set2));//false

        System.out.println(set2.containsAll(set1));//true
    }
}
