package com.practice.DSA_questions.FirstDay6ArrayQuestions1;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 1, 7, 6, 9};
        boolean ans = doSearch(arr, 9);
        System.out.println(ans);

    }

    static boolean doSearch(int arr[], int search) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return true;
            }
        }
        return false;
    }
}
