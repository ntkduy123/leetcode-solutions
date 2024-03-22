package org.dailycode.solutions.algorithm;

public class FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {
        int[] trustScores = new int[n + 1];

        for (int[] score: trust) {
            trustScores[score[0]]--;
            trustScores[score[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trustScores[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}
