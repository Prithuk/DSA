package com.stacks;

import java.util.Stack;

public class PassStackToFunction {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        displayRec(st);

    }

    public static void displayRec(Stack<Integer> st) {
        st.push(5);
        System.out.println(st);
    }
}
