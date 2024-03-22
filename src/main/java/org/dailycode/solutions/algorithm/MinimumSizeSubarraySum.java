package org.dailycode.solutions.algorithm;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int windowStart = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        for  (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            sum += nums[windowEnd];
            while (sum >= target) {
                result = Math.min(result, windowEnd - windowStart + 1);
                sum -= nums[windowStart];
                windowStart++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
