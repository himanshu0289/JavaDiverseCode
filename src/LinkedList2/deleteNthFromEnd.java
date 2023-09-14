package LinkedList2;

public class deleteNthFromEnd {
    public static Node deletenthFromlast2(Node head,int idx){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<idx+1;i++){
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static Node deletenthFromlast(Node head,int lx){
        int size=0;
        Node t=head; // idx--> nth Node from last idx
        while(t!=null){
            t=t.next;
            size++;
        }
        // n--> Nth node from start idx
        int n = size-lx+1;
        t = head;
        for (int i=1;i<n-1;i++){
            t=t.next;
        }
        t.next = t.next.next;
        return head;
    }
    public static void display(Node head){
        Node t = head;
        while (t != null){
            System.out.print(t.data+" ");
            t= t.next;
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
        Node a = new  Node(100);
        Node b = new  Node(13);
        Node c = new  Node(4);
        Node d = new  Node(5);
        Node e = new  Node(12);
        Node f = new  Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);// 100 13 4 5 12 10
//        deletenthFromlast(a,2); // 100 13 4 5 10
//        display(a);
        deletenthFromlast2(a,2);//100 13 4 5 10
        display(a);
    }
}
