package org.dailycode.solutions.algorithm;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int closest = binarySearch(arr, x);
        int left = closest != -1 ? closest : 0;
        int right = left + 1;
        List<Integer> result = new ArrayList<>();
        while (right - left - 1 <= k) {
            if (left < 0) {
                right++;
            } else if (right >= arr.length - 1 || Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                left--;
            } else {
                right++;
            }
        }

        System.out.println(left + " " + right);
        for (int i = left + 1; i < right - 1; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
