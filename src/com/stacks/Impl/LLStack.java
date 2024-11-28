package com.stacks.Impl;

public class LLStack {
    Node head = null;
    int size = 0;

    public void push(Node temp) {
        temp.next = head;
        head = temp;
        size++;
    }

    public int pop() {
        if (head == null) {
            System.out.printf("Stack is empty ");
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        if (head == null) {
            System.out.printf("Stack is empty ");
            return -1;
        }
        return head.data;
    }

    public void displayReverse() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayRecursion(Node x) {
        if (x == null) {
            return;
        }
        displayRecursion(x.next);
        System.out.print(x.data+ " ");

    }

    public void display() {
        displayRecursion(head);
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }
}
