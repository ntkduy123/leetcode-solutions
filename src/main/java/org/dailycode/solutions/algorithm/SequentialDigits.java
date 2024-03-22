package org.dailycode.solutions.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {
        String data = "123456789";
        int lowLength = String.valueOf(low).length();
        int highLength = String.valueOf(high).length();
        List<Integer> result = new ArrayList<>();
        for (int i = lowLength; i <= highLength; i++) {
            for (int start = 0; start <= 9 - i; start++) {
                int num = Integer.parseInt(data.substring(start, start + i));
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        return result;
    }
}
