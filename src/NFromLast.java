public class NFromLast {
    static void LastNNode(Node head, int n){
        Node curr = head;
        int count =0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        if (n>count){
            return ;
        }
        Node curr1 = head;
        for (int i = 1; i <(count-n+1) ; i++) {
            curr1 = curr1.next;
        }
        System.out.println(curr1.data);
    }

    static void lastNodeOpt(Node head, int n){
        Node first = head;
        for (int i = 0; i <n && first!=null ; i++) {
            first = first.next;
        }
        if (first==null){

        }
        Node second = head;
        while (first!=null){
            first =first.next;
            second =second.next;
        }
        System.out.println(second.data);
    }

    public static void main(String[] args) {
        Node head = null;
        head= InsertBeginEnd.insertEnd(head,20);
        head = InsertBeginEnd.insetBegin(head,10);
        head = InsertBeginEnd.insetBegin(head,30);
        head = InsertBeginEnd.insetBegin(head,50);
        SingleTraversal.printList(head);
        System.out.println();
        LastNNode(head,1 );
        lastNodeOpt(head,4);
    }
}
