package LinkedList;
// IMPLEMENTATION  *****Display by function ,Recursion,Reverse order by recursion,count length of LinkedList*****
public class displayLLFun_Rec {
    public static int length(Node a){
        int count=0;
        while(a!=null){
            count++;
            a=a.next;
        }
        return count;
    }

    // ****Display With Recursion function****
//    public static void displayr(Node head){
//        Node temp = head;
//        if(temp==null) return;
//        System.out.print(temp.data + " ");
//        displayr(temp.next);
//    }
    public static void displayr(Node head){
        if(head==null) return;
        System.out.print(head.data + " ");
        displayr(head.next);
    }
    public static void Reverse_fun(Node head){
        if(head==null) return;
        Reverse_fun(head.next);
        System.out.print(head.data + " ");
    }


    // ******Display with funtion*****

//    public static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//    }
    public static void display(Node head){

        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

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
        Node f = new Node(100); // 5 3 9 8 16 100

        a.next = b; // 5 -> 3 9 8 16
        b.next = c; // 5 -> 3 ->9 8 16
        c.next = d;// 5 -> 3 ->9 -> 8 16
        d.next = e;// 5 -> 3 ->9 -> 8 -> 16
        e.next = f;
        display(a);
        System.out.println();
        displayr(a);
        System.out.println();
        Reverse_fun(a);
        System.out.println();
        System.out.println(length(a)); //6
    }
}
