package com.practice.DSA_questions.FirstDay6ArrayQuestions1;

public class SumOfNegativeOrPositiveNum {
    public static void main(String[] args) {

        int arr[]={-2,33,13,-12,-5,-4,22,43};
        int ans[]=doSum(arr);
        System.out.println(" Sum of positive element present in array="+ans[0]);

        System.out.println(" Sum of negative element present in array="+ans[1]);
    }

    static  int[] doSum(int arr[]){
        int positiveSum=0;
        int negativeSum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positiveSum=positiveSum+arr[i];
            }else {
                negativeSum=negativeSum+arr[i];
            }
        }
        int ans[]={positiveSum,negativeSum};
     return ans;
    }


}
