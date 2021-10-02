package com.gg.dsa.linkedlist;

public class StackUsingLinkedList {
    int size;
    Node top;

    void push(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
    }

    Node pop() {
        Node temp = top;
        top = top.next;
        return temp;
    }

    public int peek() {
        if (top != null)
            return top.data;
        else
            return -1;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public void display() {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        } else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList obj = new StackUsingLinkedList();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        // print Stack elements
        obj.display();
        System.out.println(obj.pop().data);
        obj.display();
        System.out.println(obj.peek());
    }
}


