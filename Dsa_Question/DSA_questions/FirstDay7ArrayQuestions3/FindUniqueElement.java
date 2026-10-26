package com.practice.DSA_questions.FirstDay7ArrayQuestions3;

public class FindUniqueElement {

    public static void main(String[] args) {
        int arr[]={3,2,3,4,5,5,2};
        doOperation(arr);
    }

    static void doOperation(int arr[]){
        int xorSum=0;
        for (int n:arr){
            xorSum=xorSum^n;
        }
        System.out.println(xorSum);
    }
}
