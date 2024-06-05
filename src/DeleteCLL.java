public class DeleteCLL {
    static Node2 deleteBegin(Node2 head){
        if (head==null || head.next==head){
            return null;
        }
        Node2 curr = head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=head.next;
        return head.next;
        /**
         We can also do this O(1) time
         We copy the data of head.next into head and then delete head.next
         **/
    }

    public static void main(String[] args) {
        Node2 head=new Node2(10);
        head.next=new Node2(5);
        head.next.next=new Node2(20);
        head.next.next.next=new Node2(15);
        head.next.next.next.next=head;
        head = InsertCLL.insertBegin(head,2);
        head = InsertCLL.insertEnd(head,25);
        head=deleteBegin(head);
        head=deleteBegin(head);
        CLL.printlist(head);
    }
}
