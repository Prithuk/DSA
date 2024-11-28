package com.queue.linearqueue;

public class LinkedListImpl {

    static Node head = null;
    static Node tail = null;
    static int size = 0;

    public static void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public static void main(String[] args) {
        add(5);
        display();
        add(6);
        add(7);
        display();
        remove();
        display();
    }


    public static void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static int remove() {

        if (size == 0) {
            System.out.println("QUeue is empty");
            return -1;
        }
        int removedValue = head.data;
        head = head.next;
        size--;
        return removedValue;
    }

    public int peek() {
        return head.data;
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }


}
