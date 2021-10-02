package com.gg.dsa.linkedlist;

import java.awt.font.TextMeasurer;

public class RotateLinkedList {

    public static void main(String[] args) {
        RotateLinkedList r=new RotateLinkedList();
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(4);
        n.next.next.next = new Node(5);
        n.next.next.next.next = new Node(6);
        r.printList(r.rotateLinkedList(n,2));
    }

    Node rotateLinkedList(Node head, int count){
        Node ptr1=head;
        for (int i = 1; i <count ; i++) {
            ptr1=ptr1.next;
        }
        Node ptr2=ptr1.next;
        Node start=ptr2;
        ptr1.next=null;
        while(ptr2.next != null){
            ptr2 = ptr2.next;
        }
        ptr2.next=head;
        return start;
    }

    void printList(Node head){
        Node n=head;
        while (n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
    }
}
