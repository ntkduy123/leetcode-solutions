package org.dailycode.solutions.algorithm;

public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int negative = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                negative++;
            }

        }
        return negative % 2 == 0 ? 1 : -1;
    }
}
