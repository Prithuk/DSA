package com.stacks;

import java.util.Stack;

public class DisplayStackRecursively {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        displaySameOrder(st);
    }


    public static void displaySameOrder(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }
        int x = st.pop();
        displaySameOrder(st);
        System.out.print(x + " ");
        st.push(x);
    }
}
