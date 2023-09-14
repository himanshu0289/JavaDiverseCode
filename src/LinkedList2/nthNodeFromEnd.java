package LinkedList2;

public class nthNodeFromEnd {

    public static Node nthNode2(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<n+1;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int m = size-n+1;
        //mth Node from start...
        temp=head;
        for(int i=1;i<m;i++){
            temp = temp.next;
        }
        return temp;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f; // 100 13 4 5 12 10
        f.next = null; // default null are assign to last LinkedList ele
        Node q = nthNode(a,3); // 5
        System.out.println(q.data); // n--> from last position
//        q = nthNode(a,4); // 4
//        System.out.println(q.data);
        display(a);
        display(nthNode(a,3)); // 5 12 10
//        a= nthNode(a,3);
//        System.out.println(a); // location of ele position
        q = nthNode2(a,2); // 12
        System.out.println(q.data);
    }
}
