package org.dailycode.solutions.algorithm;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int start = 0;
        int result = 0;
        int count = 0;
        for (int end = start; end < s.length() - k; end++) {
            char c = s.charAt(end);
            if (isVowel(c)) {
                count++;
            }
            System.out.println(count);
            if (end - start + 1 > k) {
                if (isVowel(s.charAt(start))) {
                    count--;
                }
                result = Math.max(result, count);
                start++;
            }
        }
        return result;
    }

    private boolean isVowel(char c) {
        return c == 'u' || c == 'e' || c == 'o' || c == 'a' || c == 'i';
    }
}
