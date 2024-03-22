package org.dailycode.solutions.algorithm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters {

    public int maxLength(List<String> arr) {
        return maxLength(arr, 0, "");
    }

    private int maxLength(List<String> arr, int index, String res) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < res.length(); i++) {
            char c = res.charAt(i);
            if (set.contains(c )) {
                return 0;
            }
            set.add(c);
        }

        int result = res.length();
        for (int i = index; i < arr.size(); i++) {
            result = Math.max(result, maxLength(arr, i + 1, res + arr.get(i)));
        }
        return result;
    }
}
