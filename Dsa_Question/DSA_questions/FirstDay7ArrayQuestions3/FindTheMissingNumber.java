package com.practice.DSA_questions.FirstDay7ArrayQuestions3;

public class FindTheMissingNumber {
    public static void main(String[] args) {

        int nums[] = {10, 1,3,8,9, 14, 4, 11, 5, 13, 12, 6, 7};

        missingElement(nums);
    }

    static void missingElement(int nums[]) {
        int xorSum = 0;

        // XOR all elements in the array
        for (int n : nums) {
            xorSum = xorSum ^ n;
        }

        // XOR with all numbers from 1 to n
        int n=nums.length;
        for (int i = 1; i <=n+1; i++) {
            xorSum = xorSum ^ i;
        }

        System.out.println("Missing element: " + xorSum);
    }
}

