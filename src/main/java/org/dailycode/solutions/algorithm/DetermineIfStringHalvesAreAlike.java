package org.dailycode.solutions.algorithm;

public class DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                if (i < s.length() / 2) {
                    count++;
                } else count--;
            }
        }

        return count == 0;
    }
}
