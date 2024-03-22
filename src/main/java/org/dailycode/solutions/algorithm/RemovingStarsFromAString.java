package org.dailycode.solutions.algorithm;

import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RemovingStarsFromAString {

    //2390. Removing Stars From a String
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }

        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 10000; ++i) {
            executorService.submit(new Task("Lam", false));
        }
    }
}
