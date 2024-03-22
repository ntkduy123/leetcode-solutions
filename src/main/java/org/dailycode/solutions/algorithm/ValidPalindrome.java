package org.dailycode.solutions.algorithm;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        String normalizedS = s.toLowerCase();
        while (left <= right) {
            char cLeft = normalizedS.charAt(left);
            char cRight = normalizedS.charAt(right);
            if (!Character.isLetterOrDigit(cLeft)) {
                left++;
            } else if (!Character.isLetterOrDigit(cRight)) {
                right--;
            } else if (cLeft != cRight) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
