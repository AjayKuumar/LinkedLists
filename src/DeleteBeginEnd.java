public class DeleteBeginEnd {
    static Node deleteBegin(Node head){
        if (head==null){
            return head;
        }
        return head.next;
    }

    static Node deleteEnd(Node head){
        if (head==null || head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        SingleTraversal.printList(head);
        head=InsertBeginEnd.insertEnd(head,40);
        head=deleteEnd(head);
        head = InsertBeginEnd.insetBegin(head,30);
        head = InsertBeginEnd.insetBegin(head,20);
        head = InsertBeginEnd.insertEnd(head,50);
        head= InsertBeginEnd.insertMiddle(head,3,35);
        head=InsertBeginEnd.insertMiddle(head,1,10);
        head = deleteBegin(head);
        SingleTraversal.printList(head);
    }
}
