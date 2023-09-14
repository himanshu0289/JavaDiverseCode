package LinkedList;

public class basicsll {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        System.out.println(a.next); // null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16); //5 3 9 8 16

        a.next = b; // 5 -> 3 9 8 16
        b.next = c; // 5 -> 3 ->9 8 16
        c.next = d;// 5 -> 3 ->9 -> 8 16
        d.next = e;// 5 -> 3 ->9 -> 8 -> 16
        System.out.println(a.next.data); // 3
        System.out.println(b.data); // 3
        System.out.println(a.next.next.data); // 9
        Node temp = a;
//        for (int i=1;i<6;i++){
//            System.out.print(temp.data + " "); // 5 3 9 8 16
//            temp = temp.next;
//        }
     // display by while loop
        while(temp!=null){
            System.out.print(temp.data + " "); // 5 3 9 8 16
            temp = temp.next;
        }
    }
}
