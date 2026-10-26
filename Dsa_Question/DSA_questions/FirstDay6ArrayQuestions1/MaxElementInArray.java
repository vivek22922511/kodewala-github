package com.practice.DSA_questions.FirstDay6ArrayQuestions1;

public class MaxElementInArray {
    public static void main(String[] args) {

        int arr[]={2,4,65,343,87,12,3,44};
        System.out.println(findMax(arr));

    }

    static int findMax(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++) {

            if(arr[i]>max){
                max=arr[i];

            }
        }//yha poora array compare ho chuka hoga
        //then hmare max m sbse bdi value hogi so return max

        return max;
    }

}

