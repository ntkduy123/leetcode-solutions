package org.dailycode.solutions.algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatedDNASequences {

    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() <= 10) {
            return Collections.emptyList();
        }

        Set<String> set = new HashSet<>();
        int windowStart = 0;
        Set<String> result = new HashSet<>();
        for (int windowEnd = windowStart; windowEnd < s.length(); windowEnd++) {
            if (windowEnd - windowStart + 1 >= 10) {
                String dna = s.substring(windowStart, windowEnd + 1);
                if (set.contains(dna)) {
                    result.add(dna);
                } else {
                    set.add(dna);
                }
                windowStart++;
            }
        }
        return new ArrayList<>(result);
    }

}
