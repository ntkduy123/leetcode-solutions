package org.dailycode.solutions.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubsequence {
    public String minWindow(String s1, String s2) {
        Map<Character, Integer> charFreq = new HashMap<>();
        Map<Character, Integer> windowFreq = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            Character c = s2.charAt(i);
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        int matched = 0;
        int windowStart = 0;
        int left = 0;
        int right = Integer.MAX_VALUE;
        for (int windowEnd = 0; windowEnd < s1.length(); windowEnd++) {
            Character end = s1.charAt(windowEnd);
            if (charFreq.containsKey(end)) {
                windowFreq.put(end, windowFreq.getOrDefault(end, 0) + 1);
                if (windowFreq.get(end).equals(charFreq.get(end))) {
                    matched++;
                }
            }

            while (matched == charFreq.size()) {
                Character start = s1.charAt(windowStart);
                if (right - left > windowEnd - windowStart) {
                    left = windowStart;
                    right = windowEnd;
                }

                if (windowFreq.containsKey(start)) {
                    windowFreq.put(start, windowFreq.get(start) - 1);
                    if (windowFreq.get(start) < charFreq.get(start)) {
                        matched--;
                    }
                }
                windowStart++;
            }
        }
        if (right == Integer.MAX_VALUE) {
            return "";
        }
        return s1.substring(left, right + 1);
    }
}
