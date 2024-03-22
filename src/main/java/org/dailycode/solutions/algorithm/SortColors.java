package org.dailycode.solutions.algorithm;

public class SortColors {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int cur = 0;

        int temp;
        while (cur <= right) {
            if (nums[cur] == 0) {
                temp = nums[cur];
                nums[left] = nums[cur];
                nums[cur] = temp;
                left++;
                cur++;
            } else if (nums[cur] == 2) {
                temp = nums[cur];
                nums[right] = nums[cur];
                nums[cur] = temp;
                right--;
                cur++;
            } else {
                cur++;
            }
        }
    }
}
