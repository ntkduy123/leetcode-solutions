package org.dailycode.solutions.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumProfitInJobScheduling {

    private int[] table;
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Job[] jobs = new Job[startTime.length];
        table = new int[startTime.length];
        Arrays.fill(table, -1);
        for (int i = 0; i < startTime.length; i++) {
            Job job = new Job();
            job.startTime = startTime[i];
            job.endTime = endTime[i];
            job.profit = profit[i];
            jobs[i] = job;
        }

        Arrays.sort(jobs, Comparator.comparingInt(job -> job.startTime));
        return jobScheduling(jobs, startTime.length, 0);
    }

    private int jobScheduling(Job[] jobs, int length, int index) {
        if (index == length) {
            return 0;
        }

        if (table[index] != -1) {
            return table[index];
        }

        int jobIndex = findJob(jobs, length, index);
        int include = jobs[index].profit;
        if (jobIndex != -1)
            include += jobScheduling(jobs, length, jobIndex);
        int exclude = jobScheduling(jobs, length, index + 1);
        table[index] = Math.max(include, exclude);
        return table[index];
    }

    private int findJob(Job[] jobs, int length, int index) {
        int left = 0;
        int right = length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (jobs[mid].startTime >= jobs[index].endTime) {
                result = mid;
                right = mid - 1;
            } else left = mid + 1;
        }
        return result;
    }

    private static class Job {
        public int startTime;
        public int endTime;
        public int profit;
    }
}
