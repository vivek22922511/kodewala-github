package com.practice.DSA_questions.FirstDay6ArrayQuestions1;

public class Count_Zeros_And_Ones {

    public static void main(String[] args) {
        int arr[]={0,0,1,0,1,1,0,1,0,0,0,0,1,0,1,1,0};
        int ans[]=getCount(arr);
        System.out.println("Number of zeros in array="+ans[0]);
        System.out.println("Number of zeros in array="+ans[1]);
    }


    static int[] getCount(int arr[]){

        int countZero=0;
        int countOnes=0;

        for (int i=0;i<arr.length;i++){

            if (arr[i]==0){
                countZero=countZero+1;
            }
            else{
                countOnes=countOnes+1;
            }
        }
        int ans[]={countZero,countOnes};
        return ans;
    }
}
