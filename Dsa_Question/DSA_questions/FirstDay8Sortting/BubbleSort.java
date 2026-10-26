package com.practice.DSA_questions.FirstDay8Sortting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,6,2,7,4,3,1};

        int n=arr.length;

        for(int i=0;i<=n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int value:arr){
            System.out.println(value);
        }
    }
}
