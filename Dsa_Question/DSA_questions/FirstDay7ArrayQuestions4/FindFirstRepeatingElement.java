package com.practice.DSA_questions.FirstDay7ArrayQuestions4;

import com.practice.DSA_questions.FirstDay4.HashMep_All;

import java.util.HashMap;

public class FindFirstRepeatingElement {

    public static void main(String[] args) {

        int arr[]={1,2,3,5,5,6,8,};
       int result= doOperation(arr);
        System.out.println(result);


    }
    static int doOperation(int []arr){
        HashMap<Integer,Integer> freq=new HashMap<>();
        //freq store
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0) +1);


        }
        for (int i:arr){
            if(freq.get(i)>1){
              return i;
            }
        }
        return -1;

    }
}
