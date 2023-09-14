package LinkedList;

//INSERTATION*****At beginning,AtEnding and Insert b/twn node in LinkedList******
public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
//        void InsertAtEnd(int data){
//            Node temp = new Node(data);
//            if(head == null){ // empty list
//                head = temp;
//                tail = temp;
//            }
//            else{ //Non-empty list
//                tail.next = temp;
//                tail = temp;
//            }
//
//        }
        void InsertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){ // empty list
                head = temp;
            }
            else{ //Non-empty list
                tail.next = temp;
            }
            tail = temp;
        }
        void InsertAtHead(int data){
            Node temp = new Node(data);
            if(head==null) {
                head=tail=temp; // InsertAtEnd(data);
            }
            else {
                temp.next = head;
                head = temp;
            }
        }
        void InsertAt(int idx,int data){
            Node t = new Node(data);
            Node temp = head;
            if(idx == size()){
                InsertAtEnd(data);
                return;
            }
            else if(idx==0){
                InsertAtHead(data);
                return;
            } else if (idx<0 || idx>size()) {
                System.out.println("Wrong Input");
                return;
            }
            for (int i=1;i<idx;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        void display(){
            System.out.println();
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.InsertAtEnd(4);//4
        ll.InsertAtEnd(5); // 4 5
        ll.display();
        System.out.println("Size : " + ll.size());//2
        ll.InsertAtEnd(3); // 4 5 3
        ll.display();
        ll.InsertAtHead(13); // 13 4 5 3
        ll.display();
        ll.InsertAt(2,10); // 13 4 10 5 3
        ll.display();
        ll.InsertAt(0,12); // 12 13 4 10 5 3
        ll.display();

    }
}
