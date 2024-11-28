package com.stacks;

import java.util.Stack;

public class ReverseStackRecursive {

    public static void main(String[] args) {
        Stack<Integer> existingStack = new Stack<>();
        existingStack.push(1);
        existingStack.push(2);
        existingStack.push(3);
        existingStack.push(4);
        System.out.println("Before reversing: " + existingStack);

        reverseStackRecursive(existingStack);
        System.out.println("after reversing: " + existingStack);
    }


    public static void reverseStackRecursive(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return;
        }
        int temp = stack.pop();
        reverseStackRecursive(stack);
        pushToBottom(stack, temp);
    }

    public static void pushToBottom(Stack<Integer> stack, int value) {
        if (stack.size() == 0) {
            stack.push(value);
            return;
        }
        int temp = stack.pop();
        pushToBottom(stack, value);
        stack.push(temp);
    }
}
