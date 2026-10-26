package com.practice.DSA_questions.FirstDay4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();

        students.add(new Student(22,"vivek",55));
        students.add(new Student(23,"sumit",56));
        students.add(new Student(23,"ramu",57));
        students.add(new Student(21,"shyam",58));
        students.add(new Student(26 ,"kanha",59));


        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);
    }
}
