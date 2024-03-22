package org.dailycode.solutions.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOperationsToMakeArrayEmpty {

    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int result = 0;

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int count = entry.getValue();
            if (count % 3 == 0) {
                result += count / 3;
            } else if (count % 3 == 2) {
                result += (count / 3) + 1;
            } else if (count % 3 == 1 && count >= 4) {
                result += ((count - 4) / 3) + 2;
            } else if (count %  2 == 0) {
                result += count / 2;
            } else {
                return -1;
            }
        }
        return result;
    }
}
