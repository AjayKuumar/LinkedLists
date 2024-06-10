public class RemoveDup {
    static Node removeDup(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node curr = head;
        while(curr.next!=null){
            if (curr.next.data!=curr.data){
                //It next data is not same we move forward
                curr=curr.next;
            } else{
                //if next data is same we need to remove the next node
                curr.next = curr.next.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head= InsertBeginEnd.insertEnd(head,20);
        head = InsertBeginEnd.insetBegin(head, 10);
        head = InsertBeginEnd.insetBegin(head,10);
        head = InsertBeginEnd.insetBegin(head,30);
        head = InsertBeginEnd.insetBegin(head,70);
        head = InsertBeginEnd.insetBegin(head, 70);
        head = InsertBeginEnd.insetBegin(head, 70);
        SingleTraversal.printList(head);
        System.out.println();
        head = removeDup(head);
        SingleTraversal.printList(head);
    }
}
