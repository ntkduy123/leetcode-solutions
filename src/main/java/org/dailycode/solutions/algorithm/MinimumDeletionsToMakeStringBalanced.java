package org.dailycode.solutions.algorithm;

public class MinimumDeletionsToMakeStringBalanced {

    public int minimumDeletions(String s) {
        int lastIdxOfA = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                lastIdxOfA = i;
            }
        }


    }
}
