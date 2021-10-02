package com.gg.dsa.linkedlist;

public class Sort012 {

    public static void main(String[] args) {
        Sort012 sort012=new Sort012();
        RotateLinkedList r=new RotateLinkedList();
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(0);
        n.next.next.next = new Node(1);
        n.next.next.next.next = new Node(2);
        r.printList(n);
        System.out.println();
        sort012.sort(n);
        r.printList(n);
    }

    public void sort(Node head){
        if(head==null)
            return;

        Node cur=head;
        int count0=0;
        int count1=0;
        int count2=0;

        while(cur!=null){
            if(cur.data==0)
                count0++;
            else if(cur.data==1){
                count1++;
            }
            else if(cur.data==2){
                count2++;
            }
            cur=cur.next;
        }

        Node cur1=head;

        while(cur1!=null){
            if(count0>0){
                cur1.data=0;
                count0--;
            }
            else if(count1>0){
                cur1.data=1;
                count1--;
            }
            else if(count2>0){
                cur1.data=2;
                count2--;
            }
            cur1=cur1.next;
        }

    }
}
