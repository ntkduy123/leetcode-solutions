package org.dailycode.solutions.algorithm;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int result = Integer.MIN_VALUE;
        int windowStart = 0;
        Set<Character> charSet = new HashSet<>();
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            Character cEnd = s.charAt(windowEnd);
            result = Math.max(result, windowEnd - windowStart + 1);
            while (charSet.contains(cEnd)) {
                Character cStart = s.charAt(windowStart);
                charSet.remove(cStart);
                windowStart++;
            }
            charSet.add(cEnd);

        }

        return result;
    }
}
