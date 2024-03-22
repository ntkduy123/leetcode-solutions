package org.dailycode.solutions.algorithm;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = 2;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n - 1];
    }
}
