package org.dailycode.solutions.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, list, new ArrayList<>(), 0);
        return list;
    }

    private void backtrack(int[] nums, List<List<Integer>> list, List<Integer> tempList, int start) {
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(nums, list, tempList, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
