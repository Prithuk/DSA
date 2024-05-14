package com.stacks;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {

        Stack<Integer> existingStack = new Stack<>();
        existingStack.push(1);
        existingStack.push(2);
        existingStack.push(3);
        existingStack.push(4);
        System.out.println("Before reversing: " + existingStack);
        Stack<Integer> middleStack = new Stack<>();

        while (existingStack.size() > 0) {
            int poppedValue = existingStack.pop();
            middleStack.push(poppedValue);
        }
        Stack<Integer> lastStack = new Stack<>();
        while (middleStack.size() > 0) {
            int poppedValue = middleStack.pop();
            lastStack.push(poppedValue);
        }
        while (lastStack.size() > 0) {
            int poppedValue = lastStack.pop();
            existingStack.push(poppedValue);
        }

        System.out.println("After reversing" + existingStack);

    }
}
