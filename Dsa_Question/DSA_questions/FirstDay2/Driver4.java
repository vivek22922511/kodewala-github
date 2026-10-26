package com.practice.DSA_questions.FirstDay2;

import java.util.Set;
import java.util.TreeSet;


    public class Driver4{
        public static void main(String[] args) {
            Set<String> cities=new TreeSet<>();
            cities.add("vivek");
            cities.add("avive");
            cities.add("fviv");
            cities.add("dvi");
            cities.add("qwanv");
            System.out.println(cities);

            Set<Employees>empSet=new TreeSet<>();
            System.out.println("====================");
            empSet.add(new Employees(123,"kodewala"));
            empSet.add(new Employees(12,"Acadmy"));
            empSet.add(new Employees(123,"Btm"));

                for(Employees employees:empSet){
                    System.out.println(employees.id+" ,"+employees.name);
                }
        }
    }



class Employees implements Comparable<Employees> {

    int id;
    String name;

    public Employees(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employees obj) {
        int result = Integer.compare(this.id, obj.id);
        System.out.println(this.id + "," + obj.id+" ,"+result );
        return result;
    }
}

