package com.practice.DSA_questions.FirstDay7ArrayQuestions4;

import java.util.Arrays;

public class TwoSumLeetcode1 {
    public static void main(String[] args) {
        int arr[]={3,7,11,15};
        int ans[]=doSum(arr,18);
        System.out.println(Arrays.toString(ans));
    }

    static int[] doSum(int arr[],int target){

        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    int ans[]={i,j};
                    return ans;
                }
            }
        }
        int ans[]={};
        return ans;
    }
}
