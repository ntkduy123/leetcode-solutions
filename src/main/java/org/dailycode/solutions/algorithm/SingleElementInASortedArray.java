package org.dailycode.solutions.algorithm;

public class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((right - left + 1) % 4 == 1) {
                if (nums[mid + 1] == nums[mid]) {
                    left = mid + 2;
                } else if (nums[mid - 1] == nums[mid]) {
                    right = mid - 2;
                } else {
                    return nums[mid];
                }
            } else {
                if (nums[mid + 1] == nums[mid]) {
                    right = mid - 1;
                } else if (nums[mid - 1] == nums[mid]) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
        }

        return nums[left];
    }
}
