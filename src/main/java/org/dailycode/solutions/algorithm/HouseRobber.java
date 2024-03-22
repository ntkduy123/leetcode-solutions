package org.dailycode.solutions.algorithm;

public class HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int [] dp = new int[nums.length];
        dp[nums.length - 2] = Math.max(nums[nums.length - 2], nums[nums.length - 1]);
        dp[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 3; i >= 0; i--) {
            dp[i] = Math.max(nums[i] + dp[i + 2], dp[i + 1]);
        }

        return dp[0];
    }
}
