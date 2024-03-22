package org.dailycode.solutions.algorithm;

import java.util.HashMap;
import java.util.Map;

public class SingleRowKeyboard {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> keys = new HashMap<>();
        for (int i = 0; i < keyboard.length(); i++) {
            keys.put(keyboard.charAt(i), i);
        }

        int prev = 0;
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            int cur = keys.get(word.charAt(i));
            result += Math.abs(cur - prev);
            prev = cur;
        }

        return result;
    }
}
