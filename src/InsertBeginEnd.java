public class InsertBeginEnd {
    static Node insetBegin(Node head, int x){
        Node temp = new Node(x);
        if (head==null){
            return temp;
        }
        temp.next=head;
        return temp;
    }

    static Node insertEnd(Node head, int x){
        Node temp = new Node(x);
        if (head==null){
            return temp;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    static int listLength(Node head){
        int count = 0;
        Node curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }

    static Node insertMiddle(Node head,int pos, int data){
        int x = listLength(head);
        if (pos>x+1){
            return head;
        }
        if (pos==1){
            return insetBegin(head,data);
        }
        Node temp = new Node(data);
        Node curr=head;
        for (int i = 0; i < pos-2; i++) {
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head=insertEnd(head,40);
        head = insetBegin(head,30);
        head = insetBegin(head,20);
        head = insertEnd(head,50);
        head= insertMiddle(head,3,35);
        head=insertMiddle(head,1,10);
        SingleTraversal.printList(head);
    }
}
