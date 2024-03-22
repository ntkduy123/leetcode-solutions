package org.dailycode.solutions.algorithm;

public class HappyNumber {

    public int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum += d * d;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while (slow != 1 && fast != 1) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
            if (slow == fast && slow != 1) {
                return false;
            }
        }
        return true;
    }
}
