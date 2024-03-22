package org.dailycode.solutions.algorithm;

public class ReverseWordsInAString {

    public StringBuilder removeSpaces(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right && s.charAt(left) == ' ') {
            left++;
        }

        while (left <= right && s.charAt(right) == ' ') {
            right--;
        }

        StringBuilder sb = new StringBuilder();
        while (left <= right) {
            char c = s.charAt(left);

            if (c != ' ') {
                sb.append(c);
            }
            else if (sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            left++;
        }
        return sb;
    }

    public void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }


    public String reverseWords(String s) {
        StringBuilder sb = removeSpaces(s);


        reverse(sb, 0, sb.length() - 1);
        System.out.println(sb);

        int left = 0;
        int right = 0;
        while (left < sb.length()) {
            while (right < sb.length() && sb.charAt(right) != ' ') right++;
            reverse(sb, left, right - 1);
            left = right + 1;
            right++;
        }

        return sb.toString();
    }
}
