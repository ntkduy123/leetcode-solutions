package org.dailycode.solutions.algorithm;

import java.util.*;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            set2.add(i);
        }

        Set<Integer> result1 = new HashSet<>();
        Set<Integer> result2 = new HashSet<>();
        for (int i : nums1) {
            if (!set2.contains(i)) {
                result1.add(i);
            }
        }

        for (int i : nums2) {
            if (!set1.contains(i)) {
                result2.add(i);
            }
        }

        return Arrays.asList(new ArrayList<>(result1), new ArrayList<>(result2));
    }
}
