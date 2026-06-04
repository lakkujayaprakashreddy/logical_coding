package com.tek.HDFC;

import java.util.Stack;

public class MinimumElementInStaack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    // Push
    public void push(int x) {
        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Pop
    public int pop() {
        if (stack.isEmpty()) return -1;

        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }

        return removed;
    }

    // Get Min in O(1)
    public int getMin() {
        if (minStack.isEmpty()) return -1;
        return minStack.peek();
    }
}
