package com.list.doublyLinkedList;

public class DoubleLinkedListManual {

    public static void main(String[] args) {
        //4 10 2 99 13
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

        printList(a);
        printListReverse(e);

        printRandom(d);

    }


    //printing list
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

    //Printing in reverse
    public static void printListReverse(NodeDouble head) {
        if (head == null) {
            return;
        }

        NodeDouble temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.previous;
        }
        System.out.println(temp);

    }


    //Any random Node
    public static void printRandom(NodeDouble random) {
        NodeDouble temp = random;
        while (temp.previous != null) {
            temp = temp.previous;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp);
    }


}
