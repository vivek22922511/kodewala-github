package com.practice.DSA_questions.FirstDay5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer []arr={4,5,2,6,9,8,7,3,1};
        //1........... it will sort in assending order

         //Arrays.sort(arr);

//        for(int a:arr){
//
//            System.out.println(a+"");
//        }


      //2.............

        Arrays.sort(arr,new ReverseComparator());
        for(int a:arr){

            System.out.println(a+"");
        }
    }
}
