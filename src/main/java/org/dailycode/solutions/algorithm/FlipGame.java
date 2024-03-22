package org.dailycode.solutions.algorithm;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {
    public List<String> generatePossibleNextMoves(String currentState) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < currentState.length() - 1; i++) {
            if (currentState.charAt(i) == '+' && currentState.charAt(i + 1) == '+') {
                result.add(currentState.substring(0, i) + "--" + currentState.substring(i + 2));
            }
        }
        return result;
    }
}
