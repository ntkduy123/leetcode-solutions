package org.dailycode.solutions.algorithm;

public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        int result = Integer.MAX_VALUE;
        for (int i = matrix.length - 1; i >=0; i--) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == matrix.length - 1) {
                    dp[i][j] = matrix[i][j];
                } else {
                    if (j == 0) {
                        dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + matrix[i][j];
                    } else if (j == matrix[0].length - 1) {
                        dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j - 1]) + matrix[i][j];
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i + 1][j], dp[i + 1][j - 1]), dp[i + 1][j + 1]) + matrix[i][j];
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            result = Math.min(result, dp[0][i]);
        }
        return result;
    }
}
