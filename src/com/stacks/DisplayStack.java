package com.stacks;

import java.util.Stack;

public class DisplayStack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);


        //using stack
//        Stack<Integer> newStack  = new Stack<>();
//        while (st.size()>0){
//            int x = st.pop();
//            System.out.print(x + " ");
//            newStack.push(x);
//        }
//        System.out.println();
//        while (newStack.size()>0){
//            int y  = newStack.pop();
//            System.out.print(y + " ");
//            st.push(y);
//        }

        //using arrays

        int n = st.size();
        int[] arr = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int x = st.pop();
            arr[i] = x;
        }

        for (int i = 0; i < n; i++) {
            int x = arr[i];
            System.out.print(x + " ");
            st.push(x);
        }


    }
}
