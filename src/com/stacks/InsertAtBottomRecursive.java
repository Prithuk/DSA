package com.stacks;

import java.util.Stack;

public class InsertAtBottomRecursive {

    public static void main(String[] args) {
        Stack<Integer> existingStack = new Stack<>();
        existingStack.push(1);
        existingStack.push(2);
        existingStack.push(3);
        existingStack.push(4);
        System.out.println("Before adding new value" + existingStack);
        insertBottomRecursive(existingStack, 0);
        System.out.println(" After adding new value:" + existingStack);
    }

    public static void insertBottomRecursive(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
        } else {
            int temp = st.pop();
            insertBottomRecursive(st, x);
            st.push(temp);
        }
    }
}
