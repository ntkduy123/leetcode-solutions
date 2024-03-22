package org.dailycode.solutions.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
            if (set.contains(entry.getValue())) {
                return false;
            }
            set.add(entry.getValue());
        }

        return true;
    }
}
