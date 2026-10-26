package com.practice.DSA_questions.FirstDay7ArrayQuestions3;

//input---->arr[]={0,1,1,1,0,0,1,1,0}

//output---->arr[]={0,0,0,0,1,1,1,1,1}
public class Sort01 {

    public static void main(String args[]){

        int arr[]={0,1,1,1,0,0,1,1,0};

        doOperation(arr);
    }

    static void doOperation(int[]arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                //swap

                arr[i]=0;
                arr[j]=1;

            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        for (int a:arr){
            System.out.print(" "+a);
        }
    }
}
