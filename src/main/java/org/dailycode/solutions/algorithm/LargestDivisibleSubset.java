package org.dailycode.solutions.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        return largestDivisibleSubset(nums, 0);
    }

    private List<Integer> largestDivisibleSubset(int[] nums, int index) {
        List<Integer> maxList = new ArrayList<>();
        int n = index == 0 ? 1 : nums[index - 1];
        for (int i = index; i < nums.length; i++) {
            if (nums[i] % index == 0) {
                List<Integer> list = new ArrayList<>(largestDivisibleSubset(nums, index + 1));
                list.add(nums[i]);
                if (list.size() > maxList.size()) {
                    maxList = list;
                }
            }
        }

        return maxList;
    }
}
