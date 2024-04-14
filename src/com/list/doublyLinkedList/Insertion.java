package com.list.doublyLinkedList;

public class Insertion {

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

//       NodeDouble newHead = insertionDoublyLinkedList(a);
//        printList(newHead);

//        insertionAtTail(c);
//        printList(c);

      NodeDouble updatedData=   insertAtAnyIndex(a, 0, 60);
        printList(updatedData);
    }

    public static NodeDouble insertionDoublyLinkedList(NodeDouble head) {

        if (head == null) {
            return null;
        }

        NodeDouble newNode = new NodeDouble(30);

        head.previous = newNode;
        newNode.next = head;
        head = newNode;
        newNode.previous = null;
        return head;
    }

    public static void insertionAtTail(NodeDouble head) {
        if (head == null) {
            return;
        }
        NodeDouble newNode = new NodeDouble(100);
        NodeDouble temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        if (temp.next == null) {
            temp.next = newNode;
            newNode.previous = temp;
            newNode.next = null;
        }
    }

    public static NodeDouble insertAtAnyIndex(NodeDouble head, int index, int value) {
        NodeDouble newNode = new NodeDouble(value);

        if (index == 0) { // Insert at the beginning
            newNode.next = head;
            if (head != null) {
                head.previous = newNode;
            }
            head = newNode ;
            return head;
        }

        NodeDouble temp = head;
        for (int i = 1; i < index && temp !=null; i++) {
            System.out.println("Index is" + index);
            temp = temp.next;
        }
        temp.next.previous = newNode;
        newNode.previous = temp;
        newNode.next = temp.next;
        temp.next = newNode;
        return  head;
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
