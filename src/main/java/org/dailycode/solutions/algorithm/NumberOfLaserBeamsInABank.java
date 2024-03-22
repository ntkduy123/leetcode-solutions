package org.dailycode.solutions.algorithm;

public class NumberOfLaserBeamsInABank {

    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int result = 0;
        for (String s : bank) {
            int cur = 0;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '1') cur++;

            }

            result += prev * cur;
            if (cur != 0) {
                prev = cur;
            }
        }

        return result;
    }
}
