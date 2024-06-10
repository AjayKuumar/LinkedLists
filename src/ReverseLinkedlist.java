public class ReverseLinkedlist {
    static Node reverseLinkedlIst(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node recRevL(Node curr ,Node prev){
        if(curr==null){
            return prev;
        }
        Node next=curr.next;
        curr.next=prev;
        return recRevL(next,curr);
    }

    public static void main(String[] args) {
        Node head = null;
        head= InsertBeginEnd.insertEnd(head,20);
        head = InsertBeginEnd.insetBegin(head,10);
        head = InsertBeginEnd.insetBegin(head,30);
        head = InsertBeginEnd.insetBegin(head,50);
        head = InsertBeginEnd.insetBegin(head, 70);
        SingleTraversal.printList(head);
        System.out.println();
        head = reverseLinkedlIst(head);
        System.out.print("Reversed Linked list: ");
        SingleTraversal.printList(head);
        System.out.println();
        head = recRevL(head,null);
        SingleTraversal.printList(head);
    }
}
