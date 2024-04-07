package com.list.doublyLinkedList;

public class InsertionAtHead {

    public static void main(String[] args) {
        NodeDouble a = new NodeDouble(4);
        NodeDouble b = new NodeDouble(10);
        NodeDouble c = new NodeDouble(2);
        NodeDouble d = new NodeDouble(99);
        NodeDouble e = new NodeDouble(13);

        a.previous = null;
        a.next = b;
        b.previous = a;
        b.next = c;
        c.previous = b;
        c.next = d;
        d.previous = c;
        d.next = e;
        e.previous = d;
        e.next = null;

       NodeDouble newHead = insertionDoublyLinkedList(a);
        printList(newHead);
    }

    public static NodeDouble insertionDoublyLinkedList(NodeDouble head) {

        if (head == null) {
            return null ;
        }

        NodeDouble newNode= new NodeDouble(30) ;

        head.previous = newNode;
        newNode.next = head;
        head = newNode;
        newNode.previous = null;
        return head;
    }

    public static void printList(NodeDouble head) {
        if (head == null) {
            return;
        }

        NodeDouble temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp);

    }
}
