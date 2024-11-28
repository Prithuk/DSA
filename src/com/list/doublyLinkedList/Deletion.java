package com.list.doublyLinkedList;

public class Deletion {

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

//        NodeDouble updatedData = deleteAtHead(e);
//        printList(updatedData);

//        d = deleteAtTail(d);
//        printList(d);

        NodeDouble updatedData = deleteAtAnyIndex(a, 0);
        printList(updatedData);
    }

    public static NodeDouble deleteAtHead(NodeDouble head) {
        if (head == null || head.next == null) {
            return null;
        }
        head = head.next;
        head.next.previous = null;
        return head;
    }


    public static NodeDouble deleteAtTail(NodeDouble head) {
        if (head == null) {
            return null;
        }
        NodeDouble temp = head;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        if (temp.next != null) { // At least two nodes in the list
            temp.next.previous = null; // Update the prev pointer of the next node
            temp.next = null;
        } else { // Only one node in the list
            head = null;
        }
        return head; // Return the updated head of the list
    }

    public static NodeDouble deleteAtAnyIndex(NodeDouble head, int index) {

        if (index == 0) {
            head = head.next;
            head.previous = null;
            return head;
        }
        NodeDouble temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.previous = temp;
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
