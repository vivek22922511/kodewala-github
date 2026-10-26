package com.practice.DSA_questions.FirstDay6ArrayQuestions1;

public class FindUnsortedElement_InArray {
    public static void main(String[] args) {

        int arr[]={2,3,4,6,9,11,55};
        System.out.println(findUnsortedElement(arr));

    }

    static int findUnsortedElement(int arr[]){

        for (int i=0;i<arr.length;i++){

            if(arr[i+1]<=arr[i]){

                return arr[i+1];
            }

        }
    return -1;
    }

}
