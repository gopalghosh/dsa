public class Test1 {
    //input 35.5 36.7 41 32
    // n+1/2 odd   32 35.5 36.7 41
    // even n/2 n/2+1
    // duplicate allowed

    // sorted order
    //calculate median odd and eben
    // return median

    public static void main(String[] args) {
        Test1 t=new Test1();
        System.out.println("start");
        System.out.println(t.findMedian(32));
        System.out.println(t.findMedian(35.5));
        System.out.println(t.findMedian(36.7));
        System.out.println(t.findMedian(41));
    }

    Node head;
    Node currentNode;
    int count;

    public double findMedian(double temp) {
        Node n=new Node(temp);
        insertSorted(n);

        return getMedian(head);
    }

    void insertSorted(Node node){
        Node current;
        if(head==null || head.value >= node.value){
            node.next=head;
            head=node;
        }else{
            current=head;
            while (current.next != null
                    && current.next.value < node.value)
                current = current.next;

            node.next=current.next;
            current.next = node;
        }
    }

    double getMedian(Node node){
        double median=0;
        if(node==null){
            return 0;
        }
        while(node!=null){
            count++;
            node=node.next;
        }

        if(count%2==0){
            median=(getNodeByIndex(count/2, head).value+getNodeByIndex(count/2+1, head).value)/2;
        }else{
            median=getNodeByIndex((count+1)/2, head).value;
        }
        return median;
    }


    Node getNodeByIndex(int i ,Node head){
        Node node=null;
        int count=0;
        while (i>count){
            node=head.next;
            count++;
        }
        return node;
    }
}

class Node {
    double value;
    Node next;
    public Node(double value) {
        this.value = value;
    }
}
