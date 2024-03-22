package org.dailycode.solutions.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertAnArrayIntoA2DArrayWithConditions {

    public List<List<Integer>> findMatrix(int[] nums) {
        int count = 0;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int i = 0;
        while (count < nums.length) {
            if (!temp.contains(nums[i]) && nums[i] != -1) {
                temp.add(nums[i]);
                nums[i] = -1;
                count++;
            }
            i++;
            if (i == nums.length) {
                i = 0;
                result.add(temp);
                temp = new ArrayList<>();
            }
        }

        return result;
    }
}
