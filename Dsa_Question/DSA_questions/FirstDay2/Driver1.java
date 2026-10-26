package com.practice.DSA_questions.FirstDay2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Driver1 {
    public static void main(String[] args) {
        Set<String> cities=new LinkedHashSet<>();

        cities.add("vivek");
        cities.add("Papa");
        cities.add("Mmy");
        cities.add("Bhai");
        cities.add(null);
        //cities.add(null); only one null is allowed
        //reading the element....
        System.out.println(cities);
    }
}
