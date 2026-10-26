package com.practice.DSA_questions.FirstDay7ArrayQuestions2;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
       doReverseArray(arr);

    }
    static void doReverseArray(int arr[]){
        int n= arr.length;
        int i=0;
        int j=n-1;

        while (i<=j){

            //swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            //incress i +1
            i++;

            //decrease j +1
            j--;
        }

        //now array reverse ho chuka h
        for (int a:arr){
            System.out.println(a);
        }
    }
}
