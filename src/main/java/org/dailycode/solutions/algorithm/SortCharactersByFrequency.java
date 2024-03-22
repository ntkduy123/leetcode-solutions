package org.dailycode.solutions.algorithm;

import java.util.*;

public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        List<Character> characters = new ArrayList<>(counts.keySet());
        characters.sort((a, b) -> counts.get(b) - counts.get(a));

        StringBuilder result = new StringBuilder();
        for (char c : characters) {
            int count = counts.get(c);
            result.append(String.valueOf(c).repeat(Math.max(0, count)));
        }

        return result.toString();
    }
}
