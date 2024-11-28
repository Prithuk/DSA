package com.stacks;

import java.util.Stack;

public class InsertAtBottom {

    public static void main(String[] args) {

        Stack<Integer> existingStack = new Stack<>();
        existingStack.push(1);
        existingStack.push(2);
        existingStack.push(3);
        existingStack.push(4);
        System.out.println("Before adding new value" + existingStack);
        Stack<Integer> temporaryStack = new Stack<>();

        while (existingStack.size() > 0) {
            int movedValue = existingStack.pop();
            temporaryStack.push(movedValue);
        }
        existingStack.push(0);
        while (temporaryStack.size() > 0) {
            existingStack.push(temporaryStack.pop());
        }
        System.out.println("New value is added " + existingStack);
    }
}
