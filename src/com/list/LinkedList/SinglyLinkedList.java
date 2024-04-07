package com.list.LinkedList;

public class SinglyLinkedList {

    Node head;

    //add First
    public void addNodeBeginning(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add Last
    public void addNodeLast(String data) {
        Node newNode = new Node(data);
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //Delete at first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Nothing to delete");
            return;
        }
        head = head.next;
    }

    //delete at last
    public void deleteLast() {
        if (head == null) {
            System.out.println("Nothing to delete");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }


    //reverse iterate
    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }
        
        Node prevNode= head ;
        Node currNode = head.next;

        while(currNode.next!=null){
            Node nextNode = currNode.next;
            currNode.next= prevNode;

            //update value
            prevNode= currNode;
            currNode= nextNode;
        }
        head.next=null ;
         head=prevNode;
    }

    //reverse Recursive
    public  Node reverseRecursive(Node head){

        if(head==null || head.next==null){
            System.out.printf("head"+head);
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        System.out.printf("head.next.next"+head.next.next);
        head.next.next = head;
        head.next= null ;
        System.out.printf("newhead"+newHead);
        return  newHead;
    }
}
