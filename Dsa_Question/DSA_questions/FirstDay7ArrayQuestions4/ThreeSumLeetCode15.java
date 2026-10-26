package com.practice.DSA_questions.FirstDay7ArrayQuestions4;

import java.util.*;

public class ThreeSumLeetCode15 {

    public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> output = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        Collections.sort(temp);

                        output.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(output);
    }
}
