package org.dailycode.solutions.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(nums, list, new ArrayList<>());
        return list;
    }

    private void backtrack(int[] nums, List<List<Integer>> list, List<Integer> tempList) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        }

        for (int num : nums) {
            if (!tempList.contains(num)) {
                tempList.add(num);
                backtrack(nums, list, tempList);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
