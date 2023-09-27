package com.list.LinkedList;

public class SingleLinkedListImpl {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addNodeBeginning("KATHET");
        singlyLinkedList.addNodeBeginning("Singh");
        singlyLinkedList.addNodeBeginning("PRITHU");
        singlyLinkedList.addNodeLast("YES");
        singlyLinkedList.printList();
        singlyLinkedList.deleteLast();
        System.out.println("After deletion first");
        singlyLinkedList.printList();
    }
}
