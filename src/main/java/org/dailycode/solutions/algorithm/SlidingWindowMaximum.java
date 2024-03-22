package org.dailycode.solutions.algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();

        int windowStart = 0;
        int max = Integer.MIN_VALUE;
        List<Integer> result = new ArrayList<>();
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            if (nums[windowEnd] >= max) {
                max = nums[windowEnd];
                deque.addFirst(max);
            } else {
                int last = deque.getLast();
                if (nums[windowEnd] >= last) {
                    deque.removeLast();
                }
                deque.addLast(nums[windowEnd]);
            }

            if (windowEnd - windowStart + 1 == k) {
                result.add(max);
            } else if (windowEnd - windowStart + 1 > k) {
                if (nums[windowStart] == max) {
                    deque.removeFirst();
                    max = deque.getFirst();
                }
                result.add(max);
                windowStart++;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
