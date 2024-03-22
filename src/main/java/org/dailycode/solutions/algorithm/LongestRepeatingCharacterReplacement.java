package org.dailycode.solutions.algorithm;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int windowStart = 0;
        int max = 0;
        Map<Character, Integer> charFreq = new HashMap<>();
        int result = 0;
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            Character c = s.charAt(windowEnd);
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
            max = Math.max(charFreq.get(c), max);
            if (windowEnd - windowStart + 1 - max > k) {
                Character cStart = s.charAt(windowStart);
                charFreq.put(cStart, charFreq.get(cStart) - 1);
                windowStart++;
            }

            result = Math.max(result, windowEnd - windowStart + 1);
        }
        return result;
    }
}
