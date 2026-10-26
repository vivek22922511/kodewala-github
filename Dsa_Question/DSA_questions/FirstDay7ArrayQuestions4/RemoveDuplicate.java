package com.practice.DSA_questions.FirstDay7ArrayQuestions4;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 3, 1, 2, 4, 5, 4, 6, 7};

        Arrays.sort(arr);

        int count = doOperation(arr);

        System.out.println("Number of unique elements: " + count);

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int doOperation(int[] arr) {

        int i = 0;
        int j = 1;
        int n = arr.length;

        while (j < n) {

            if (arr[i] == arr[j]) {
                j++;
            } else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }

        return i + 1;
    }
}
