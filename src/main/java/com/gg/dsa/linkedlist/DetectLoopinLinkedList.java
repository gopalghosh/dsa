package com.gg.dsa.linkedlist;

public class DetectLoopinLinkedList {

    public static void main(String[] args) {
        DetectLoopinLinkedList r=new DetectLoopinLinkedList();
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(4);
        n.next.next.next = new Node(5);
        n.next.next.next.next = new Node(6);
        //n.next.next.next.next=n.next.next;

        System.out.println(r.detectLoop(n));
    }

    boolean detectLoop(Node head){
        Node fast=head;
        Node slow=head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast.equals(slow)) {
                return true;
            }
        }
        return false;
    }

}
