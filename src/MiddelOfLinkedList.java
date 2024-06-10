public class MiddelOfLinkedList {
    static int middle(Node head){
        if (head==null){
            return -1;
        }
        //using two references one moves in 2x speed and other n x speed
        // If fast reaches to end then slow will reach to middle automatically
        //return slw data
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node head = null;
        head= InsertBeginEnd.insertEnd(head,20);
        head = InsertBeginEnd.insetBegin(head,10);
        head = InsertBeginEnd.insetBegin(head,30);
        head = InsertBeginEnd.insetBegin(head,50);
        SingleTraversal.printList(head);
        System.out.println();
        System.out.println(middle(head));
    }
}
