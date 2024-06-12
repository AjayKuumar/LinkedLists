public class EvenandODdd {
    static Node segregateEvenOdd(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node es = null;
        Node ee = null;
        Node os = null;
        Node oe = null;
        Node curr = head;
        while (curr!=null){
            if (curr.data%2==0){
                if (es==null){
                    es=curr;
                    ee =curr;
                }else{
                    ee.next =curr;
                    ee = ee.next;
                }
            }else{
                if (os==null){
                    os=curr;
                    oe=curr;
                }else{
                    oe.next =curr;
                    oe=oe.next;
                }
            }
            curr=curr.next;
        }
        if (es==null || os == null){
            return null;
        }
        ee.next=os;
        oe.next=null;
        return es;
    }

    public static void main(String[] args) {
        Node head = null;
        head= InsertBeginEnd.insertEnd(head,20);
        head = InsertBeginEnd.insetBegin(head,10);
        head = InsertBeginEnd.insetBegin(head,23);
        head = InsertBeginEnd.insetBegin(head,51);
        head = InsertBeginEnd.insetBegin(head, 70);
        head = InsertBeginEnd.insetBegin(head,15);
        head = InsertBeginEnd.insetBegin(head,92);
        head = InsertBeginEnd.insetBegin(head, 83);
        SingleTraversal.printList(head);
        System.out.println();
        head = segregateEvenOdd(head);
        SingleTraversal.printList(head);
    }
}
