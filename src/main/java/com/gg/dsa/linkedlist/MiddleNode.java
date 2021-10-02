package com.gg.dsa.linkedlist;

public class MiddleNode {
    //1->2->4->5->6
    //output 4

    public static void main(String[] args) {
        MiddleNode m = new MiddleNode();
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(4);
        n.next.next.next = new Node(5);
        n.next.next.next.next = new Node(6);
        System.out.println("middle value:" + m.findMiddle(n));
    }

    int findMiddle(Node head) {
        Node fastPtr = head;
        Node slowPtr = head;
        if (head == null)
            return -1;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr.data;
    }
}
