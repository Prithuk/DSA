package com.stacks.Impl;

public class LLImpl {
    static Node head;

    public static void main(String[] args) {
        LLStack llStack = new LLStack();
        Node node = new Node(4);
        llStack.push(node);
        llStack.displayReverse();

        Node node1 = new Node(5);
        llStack.push(node1);
        llStack.displayReverse();

        Node node2 = new Node(1);
        llStack.push(node2);
        llStack.displayReverse();

        Node node3 = new Node(7);
        llStack.push(node3);
        llStack.displayReverse();

        Node node4 = new Node(0);
        llStack.push(node4);
        llStack.displayReverse();

        llStack.displayReverse();
        llStack.display();

       int peekValue= llStack.peek();
        System.out.println("peekvalue "+ peekValue);

        int size = llStack.getSize();
        System.out.println("size "+ size);
    }




}
