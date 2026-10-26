package com.practice.DSA_questions.FirstDay8Sortting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={8,5,4,6,3,2,9,1,7};
        int n=arr.length;

        for(int i=1;i<n;i++){

            int curr=i;
            int prev=i-1;
            int currValue=arr[i];
            //shifting
            while (prev>=0&&currValue<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=currValue;
        }
        for(int value:arr){
            System.out.println(value);
        }
    }
}
