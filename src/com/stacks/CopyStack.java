package com.stacks;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        //to put stack in opposite order
        Stack<Integer> newUpdated = new Stack<>();

        while (st.size() > 0) {
            int x = st.peek();
            newUpdated.push(x);
            st.pop();
        }
        System.out.println(newUpdated);
        System.out.println(st);


//        int n;
//        System.out.println("Enter the number of elements you want to enter");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        System.out.println("Enter the elements");
//        for (int i = 1; i <= n; i++) {
//            int x = sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);
    }
}
