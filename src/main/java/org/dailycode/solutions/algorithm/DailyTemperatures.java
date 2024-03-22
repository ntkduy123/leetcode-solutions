package org.dailycode.solutions.algorithm;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        if (length == 1) {
            return new int[]{0};
        }
        int[] result = new int[length];
        result[length - 1] = 0;
        for (int cur = length - 2; cur >= 0; cur--) {
            int days = 1;
            int nextDay = cur + 1;
            while (nextDay < length) {
                if (temperatures[nextDay] > temperatures[cur]) {
                    break;
                } else {
                    if (result[nextDay] == 0) {
                        days = 0;
                        break;
                    } else {
                        days += result[nextDay];
                        nextDay = nextDay + result[nextDay];
                    }
                }

            }
            result[cur] = days;
        }
        return result;
    }
}
