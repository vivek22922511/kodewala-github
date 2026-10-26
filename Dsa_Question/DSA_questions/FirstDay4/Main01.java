package com.practice.DSA_questions.FirstDay4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();

        students.add(new Student(22,"vivek",58));
        students.add(new Student(23,"sumit",53));
        students.add(new Student(23,"ramu",105));
        students.add(new Student(21,"shyam",59));
        students.add(new Student(26 ,"kanha",69));


        System.out.println(students);
//it work like this but it is not gud so  not all code is present in weightComparable


        //first option

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.weight -o2.weight;
//            }
//        });
//        System.out.println(students);



  //second option

//        Collections.sort(students, new WeightComparator()); {
//            System.out.println(students);
//            }


        //third option...........

        //lembda expretion

        Collections.sort(students,((o1, o2) -> o1.weight-o2.weight));

    }

}
