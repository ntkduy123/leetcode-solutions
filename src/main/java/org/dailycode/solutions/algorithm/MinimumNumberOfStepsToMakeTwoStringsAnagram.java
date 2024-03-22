package org.dailycode.solutions.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public int minSteps(String s, String t) {
        Map<Character, Integer> sFreq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            sFreq.put(c1, sFreq.getOrDefault(c1, 0) + 1);
            sFreq.put(c2, sFreq.getOrDefault(c2, 0) - 1);
        }

        int result = 0;
        for (Map.Entry<Character, Integer> entry : sFreq.entrySet()) {
            result += Math.max(0, entry.getValue());
        }
        return result;
    }
}
