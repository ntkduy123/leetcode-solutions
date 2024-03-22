package org.dailycode.solutions.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeastNumberOfUniqueIntegersAfterKRemovals {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> freq = new PriorityQueue<>(map.values());

        int count = 0;
        while (!freq.isEmpty()) {
            count += freq.peek();
            if (count > k) {
                return freq.size();
            }

            freq.poll();
        }

        return 0;
    }
}
