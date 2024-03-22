package org.dailycode.solutions.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombinationSumIV {

    private Map<Integer, Integer> map = new HashMap<>();

    public int combinationSum4(int[] nums, int target) {
        return combinationSum4Recursive(nums, target);
    }

    public int combinationSum4Recursive(int[] nums, int target) {
        if (target < 0) {
            return 0;
        }

        if (target == 0) {
            return 1;
        }

        int count = 0;
        for (int num : nums) {
            if (map.containsKey(target - num)) {
                count += map.get(target - num);
            } else {
                int next = combinationSum4(nums, target - num);
                map.put(target - num, next);
                count += next;
            }

        }
        return count;
    }
}
