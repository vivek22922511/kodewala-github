package com.practice.DSA_questions.FirstDay6ArrayQuestions1;

public class MultiplyEachElementOfArrayBy10 {

    public static void main(String[] args) {

        int[] arr = {12, 34, 56, 54, 32, 122};
        int[] ans = doMultiply(arr);
        System.out.println("printing ans array :-");
        for (int i : ans) {
            System.out.println(" " + i);
        }
    }

    static int[] doMultiply(int[] arr) {

        int size = arr.length;
        int newArray[] = new int[size];

        for (int i = 0; i < size; i++) {

            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;


        }
        return newArray;
    }
}


