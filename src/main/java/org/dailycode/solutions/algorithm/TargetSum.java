package org.dailycode.solutions.algorithm;

public class TargetSum {

    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        if (total < Math.abs(target)) {
            return 0;
        }
        Integer[][] dp = new Integer[nums.length][2 * total + 1];
        return findTargetSumWays(nums, target, 0, total, 0, dp);
    }

    public int findTargetSumWays(int[] nums, int target, int sum, int total, int i, Integer[][] dp) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }

        if (dp[i][sum + total] != null) {
            return dp[i][sum + total];
        }

        int plus = findTargetSumWays(nums, target, sum + nums[i], total, i + 1, dp);
        int minus = findTargetSumWays(nums, target, sum - nums[i], total, i + 1, dp);
        dp[i][sum + total] = plus + minus;
        return dp[i][sum + total];
    }
}
