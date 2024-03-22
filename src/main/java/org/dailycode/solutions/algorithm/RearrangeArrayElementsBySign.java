package org.dailycode.solutions.algorithm;

public class RearrangeArrayElementsBySign {

    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int j = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                while (nums[j] < 0) {
                    j++;
                }
                result[i] = nums[j];
                j++;
            } else {
                while (nums[k] > 0) {
                    k++;
                }
                result[i] = nums[k];
                k++;
            }


        }

        return result;
    }
}
