package com.practice.DSA_questions.FirstDay4;

import java.util.*;

public class HashMep_All {
    public static void main(String[] args) {
        Map<String,String>mapping=new HashMap<>();

        //insertion in Map

         mapping.put("IN->","INDIA");
        mapping.put("USA->","united state of america");
        mapping.put("CH->","china");
        mapping.put("R->","russia");
        System.out.println(mapping);

        Map<String,String>table=new HashMap<>();

        table.put("BR","berlin");//1................
        System.out.println("before"+table);

        table.putAll(mapping);//2..................
        System.out.println("after"+table);
        System.out.println(" table size after puttAll "+table.size());
//
//        table.clear();//3...........
//        System.out.println(" table after clear "+table);
//        System.out.println(" table  size after clear "+table.size());

        table.putIfAbsent("PL","polend");//4............
        System.out.println(table);

        //5....................
        System.out.println(table.get("BR"));
        // if we enter wrong input then it will return null..
        System.out.println(table.get("hr"));

        //6..........
        //if we enter wrong input and want to give default means[any name or something] value

        System.out.println(table.getOrDefault("T","there is no value of [T]"));

        //7...............false
        System.out.println(table.containsKey("I->"));//it will give true or false

        //8.............true
        System.out.println(table.containsValue("polend"));

        //9.........

        table.replace("IN->","Indian");
        System.out.println("after"+table);


        //10............check all key of map
        //it returns set that's why we need to create a set

        //Set<String>keySet=table.keySet();
        //System.out.println(keySet);

        //12.......check all the values of map
        //it will return  collection that's why we need to create a collection

        Collection<String>valueCollection=table.values();

        System.out.println(valueCollection);



        //13......... get all the set of entry in a single time

        Set<Map.Entry<String, String>>entrySet=table.entrySet();
        System.out.println("total entries= "+entrySet);

        // 14.... iterating over a map

        for (Map.Entry<String,String>entry: mapping.entrySet());
        {
            System.out.println("itrating "+entrySet);
        }














    }
}
