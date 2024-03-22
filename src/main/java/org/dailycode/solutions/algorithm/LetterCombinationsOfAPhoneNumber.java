package org.dailycode.solutions.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

    private Map<Character, String> lettersMap = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (!digits.isEmpty()) {
            backtrack(digits, list, new StringBuilder(), 0);
        }
        return list;
    }

    private void backtrack(String digits, List<String> list, StringBuilder temp, int start) {
        if (digits.length() == temp.length()) {
            list.add(temp.toString());
        }

        for (int i = start; i < digits.length(); i++) {
            Character c = digits.charAt(i);
            String letters = lettersMap.get(c);
            for (int j = 0; j < letters.length(); j++) {
                temp.append(letters.charAt(j));
                backtrack(digits, list, temp, i + 1);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
}
