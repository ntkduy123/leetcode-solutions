package org.dailycode.solutions.algorithm;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        int sumSalary = 0;
        int N = salary.length;
        for (int i = 0; i < N; i++) {
            minSalary = Math.min(minSalary, salary[i]);
            maxSalary = Math.max(maxSalary, salary[i]);
            sumSalary += salary[i];
        }

        return (double) (sumSalary - minSalary - maxSalary) / (N - 2);
    }
}
