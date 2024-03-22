package org.dailycode.solutions.algorithm;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    public static class MyQueue {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        private int front;

        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            if (stack1.isEmpty()) {
                front = x;
            }
            stack1.push(x);
        }

        public int pop() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.pop();
        }

        public int peek() {
            if (stack2.isEmpty()) {
                return front;
            }
            return stack2.peek();
        }

        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
}
