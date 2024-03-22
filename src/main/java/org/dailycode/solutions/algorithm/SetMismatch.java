package org.dailycode.solutions.algorithm;

public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int sum = 0;
        int length = nums.length;
        for (int num : nums) {
            sum += num;
        }

        int dup = -1;
        for (int i = 0; i < length; i++) {
            int cur = Math.abs(nums[i]);
            if (nums[cur - 1] < 0) {
                dup = cur;
                break;
            }
            nums[cur - 1] *= -1;
        }

        int realSum = length * (length + 1) / 2;
        int missing = dup - (sum - realSum);
        return new int[]{dup, missing};
    }
}
