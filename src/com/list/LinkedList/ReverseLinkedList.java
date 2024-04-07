package com.list.LinkedList;

import com.revision.list.Node;

public class ReverseLinkedList {
    public static com.revision.list.Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head; // Either the list is empty or has only one element
        }

        com.revision.list.Node preNode = head;
        com.revision.list.Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = preNode;

            //update
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
        return head;
    }
}
