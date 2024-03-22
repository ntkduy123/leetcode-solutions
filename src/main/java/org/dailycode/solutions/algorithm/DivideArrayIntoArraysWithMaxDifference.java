package org.dailycode.solutions.algorithm;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {

    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] result = new int[n / 3][3];
        for (int i = 0; i <= n - 3; i = i + 3) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][0];
            }

            int index = i / 3;
            result[index][0] = nums[i];
            result[index][1] = nums[i + 1];
            result[index][2] = nums[i + 2];
        }
        return result;
    }
}
