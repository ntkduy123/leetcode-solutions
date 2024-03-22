package org.dailycode.solutions.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        Map<Character, Integer> charFreq = new HashMap<>();
        Map<Character, Integer> temp = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            temp.put(c, temp.getOrDefault(c, 0) + 1);
        }

        int matched = 0;
        int windowStart = 0;
        int left = 0;
        int right = Integer.MAX_VALUE;
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            Character cEnd = s.charAt(windowEnd);
            if (temp.containsKey(cEnd)) {
                charFreq.put(cEnd, charFreq.getOrDefault(cEnd, 0) + 1);
                if (charFreq.get(cEnd).equals(temp.get(cEnd))) {
                    matched++;
                }
            }

            while (matched == temp.size() && windowStart < windowEnd) {
                Character cStart = s.charAt(windowStart);

                if (right - left > windowEnd - windowStart) {
                    left = windowStart;
                    right = windowEnd;
                }

                if (charFreq.containsKey(cStart)) {
                    charFreq.put(cStart, charFreq.get(cStart) + 1);
                    if (temp.get(cStart) > charFreq.get(cStart)) {
                        matched--;
                    }
                }
                windowStart++;
            }


        }

        System.out.println(left + " " + right);
        if (right - left == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(left, right + 1);
    }
}
