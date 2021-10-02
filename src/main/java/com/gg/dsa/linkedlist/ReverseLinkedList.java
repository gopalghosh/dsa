package com.gg.dsa.linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ReverseLinkedList r=new ReverseLinkedList();
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(4);
        n.next.next.next = new Node(5);
        n.next.next.next.next = new Node(6);
        r.printList(r.reverseLinkedList(n));
    }

    Node reverseLinkedList(Node head){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    void printList(Node head){
        Node n=head;
        while (n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
    }

}
