package com.practice.DSA_questions.FirstDay6ArrayQuestions1;

public class SwapAlternateElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(doSwapAlternateElement(arr));
//        System.out.println(arr[i+1]);
//        System.out.println(arr[i]);


    }

    static int doSwapAlternateElement(int arr[]){


        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>arr[i+1])
            {
                int temp=0;
                temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }

        }
//        Integer ans[]={arr[i+1],arr[i]};
        return -1;

    }
}
