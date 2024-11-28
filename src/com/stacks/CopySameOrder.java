package com.stacks;

import java.util.Stack;

public class CopySameOrder {

    public static void main(String[] args) {
        Stack<Integer> firstStack = new Stack<>();
        firstStack.push(1);
        firstStack.push(2);
        firstStack.push(3);
        firstStack.push(4);
        firstStack.push(5);
        System.out.println("The first stack is:" + firstStack);
        Stack<Integer> secondStack = new Stack<>();

        while (firstStack.size() > 0) {
            int x = firstStack.pop();
            secondStack.push(x);
        }
        System.out.println("THe second stack before moving" + secondStack);
        Stack<Integer> lastStack = new Stack<>();
        while (secondStack.size() > 0) {
            int x = secondStack.pop();
            lastStack.push(x);
        }
        System.out.println("THe last stack " + lastStack);
        System.out.println(secondStack );
    }
}
