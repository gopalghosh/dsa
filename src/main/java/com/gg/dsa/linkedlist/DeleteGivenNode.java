package com.gg.dsa.linkedlist;

public class DeleteGivenNode {
    public static void main(String[] args) {
        DeleteGivenNode r=new DeleteGivenNode();
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(4);
        n.next.next.next = new Node(5);
        n.next.next.next.next = new Node(6);
        r.printList(n);
        System.out.println();
        r.deleteNode(n.next.next.next);
        r.printList(n);
    }

    void deleteNode(Node node){
    if(node==null && node.next==null)
        return;
        node.data=node.next.data;
        node.next=node.next.next;

    }

    void printList(Node head){
        Node n=head;
        while (n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
    }
}
