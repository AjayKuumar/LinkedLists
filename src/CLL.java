class Node2{
    int data;
    Node2 next;
    Node2 (int d){
        data=d;
        next=null;
    }
}
public class CLL {
    static void printlist(Node2 head){
        if (head==null){
            return ;
        }
        Node2 curr = head;
//        do {
//            System.out.print(curr.data+" ");
//            curr=curr.next;
//        }while(curr!=head);
        while(curr.next!=head){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.print(curr.data); //Last Node data printing explicitly
    }
    public static void main(String[] args) {
        Node2 head=new Node2(10);
        head.next=new Node2(5);
        head.next.next=new Node2(20);
        head.next.next.next=new Node2(15);
        head.next.next.next.next=head;
        printlist(head);
    }
}
