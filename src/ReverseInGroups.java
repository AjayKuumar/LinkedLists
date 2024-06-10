public class ReverseInGroups {
    static Node reverseInGroups(Node head, int k){
        if (head==null || head.next==null){
            return head;
        }
        Node curr = head;
        Node prev = null;
        Node next = null;
        int count  =0;

        //First reversing k elements
        while ( curr!=null && count<k){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
            count++;
        }

        //if next is not null and any element present we again call resursively same function unitl next is null
        if (next!=null){
            Node resHead = reverseInGroups(curr,k);
            head.next = resHead;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = null;
        head= InsertBeginEnd.insertEnd(head,20);
        head = InsertBeginEnd.insetBegin(head,10);
        head = InsertBeginEnd.insetBegin(head,30);
        head = InsertBeginEnd.insetBegin(head,50);
        head = InsertBeginEnd.insetBegin(head, 70);
        head = InsertBeginEnd.insetBegin(head,15);
        head = InsertBeginEnd.insetBegin(head,90);
        head = InsertBeginEnd.insetBegin(head, 80);
        SingleTraversal.printList(head);
        System.out.println();
        head = reverseInGroups(head, 3);
        SingleTraversal.printList(head);
    }
}
