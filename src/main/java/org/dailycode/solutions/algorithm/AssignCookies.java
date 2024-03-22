package org.dailycode.solutions.algorithm;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int result = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
                j++;
                result++;
            } else {
                j++;
            }
        }
        return result;
    }
}
