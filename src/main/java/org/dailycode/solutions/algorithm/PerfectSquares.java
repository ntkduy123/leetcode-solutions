package org.dailycode.solutions.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectSquares {

    int[] cache;

    public int numSquares1(int n) {
        cache = new int[n + 1];
        Arrays.fill(cache, -1);
        List<Integer> squares = new ArrayList<>();
        int i = 1;
        while (i <= Math.sqrt(n)) {
            squares.add(i * i);
            i++;
        }

        return numSquares(n, squares);
    }

    public int numSquares2(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = 1;

        List<Integer> squares = new ArrayList<>();
        int i = 1;
        while (i <= Math.sqrt(n)) {
            squares.add(i * i);
            i++;
        }

        for (i = 2; i <= n; i++) {
            for (int square : squares) {
                if (i < square)
                    break;
                dp[i] = Math.min(dp[i], 1 + dp[i - square]);
            }
        }

        return dp[n];
    }

    private int numSquares(int n, List<Integer> squares) {
        if (n == 0) {
            return 0;
        }

        if (cache[n] != -1) {
            return cache[n];
        }

        int result = Integer.MAX_VALUE;
        for (int square : squares) {
            if (n < square)
                break;
            result = Math.min(result, 1 + numSquares(n - square, squares));
        }

        cache[n] = result;
        return cache[n];
    }
}
