package com.practice.DSA_questions.FirstDay7ArrayQuestions2;

public class ShiftArrayElementBy_1_Position {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

        doShiftBy1(arr);
        for (int i:arr){
            System.out.println(i);
        }

    }

    static void doShiftBy1(int arr[]){

        //1..store last value of array in temp
        int n=arr.length;
        int temp=arr[n-1];

        //2..shift all value of array

        for(int i=n-1;i>0;i--){

            arr[i]=arr[i-1];
        } 
        //3..that tamp value store in the arr[0];

        arr[0]=temp;
    }
}
