package org.dailycode.solutions.algorithm;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int cur = 0; cur < nums.length; cur++) {
            int low = cur + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[cur] + nums[low] + nums[high];
                if (sum == 0) {
                    set.add(new ArrayList<>(Arrays.asList(nums[cur], nums[low], nums[high])));
                    low++;
                    high--;
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
