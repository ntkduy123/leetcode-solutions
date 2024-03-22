package org.dailycode.solutions.algorithm;

import java.util.Arrays;

public class FindPolygonWithTheLargestPerimeter {

    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int result = -1;
        int sum = 0;
        for (int num : nums) {
            if (sum > num) {
                result = sum + num;
            }
            sum += num;
        }

        return result;
    }
}
