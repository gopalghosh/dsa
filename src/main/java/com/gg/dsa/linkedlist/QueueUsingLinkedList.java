package com.gg.dsa.linkedlist;

public class QueueUsingLinkedList {

    Node first;
    Node last;

    public void push(int data) {
        Node n = new Node(data);
        if (last == null) {
            first = n;
            last = n;
        } else
            last.next = n;
            last=n;
    }

    int getFront(){
        return first.data;
    }

    int getRear(){
        return last.data;
    }

    int remove(){
        if(last==null){
            System.out.println("Empty");
            return Integer.MAX_VALUE;
        }
        int data=first.data;
        first=first.next;

        return data;
    }

    public void display() {
        // check for stack underflow
        if (last == null) {
            System.out.printf("\nQueue Underflow");
            return;
        } else {
            Node temp = first;
            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        QueueUsingLinkedList obj = new QueueUsingLinkedList();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);
        obj.display();
        System.out.println("\n"+obj.getFront());
        System.out.println(obj.getRear());
        obj.remove();
        obj.display();
    }
}
