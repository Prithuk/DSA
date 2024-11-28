package com.stacks;

import java.util.Stack;

public class BasicStacks {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(10);
        st.push(100);
        st.push(123);
        st.push(112);
        System.out.println(st.peek());

    }
}
