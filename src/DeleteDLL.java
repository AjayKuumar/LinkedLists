public class DeleteDLL {
    static Node1 deleteBegin(Node1 head){
        if (head==null || head.next==null){
            return null;
        }
        head.next.prev=null;
        return head.next;
    }
    static Node1 deleteLast(Node1 head){
        if (head==null || head.next==null){
            return null;
        }
        Node1 curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;
    }
    public static void main(String[] args) {
        Node1 head = new Node1(10);
        Node1 node2 = new Node1(20);
        Node1 node3 = new Node1(30);
        head.next=node2;
        node2.prev =head;
        node2.next =node3;
        node3.prev=node2;
        head = InsertDLL.insertBegin(head,5);
        head= InsertDLL.insertBegin(head,2);
        head = InsertDLL.insertEnd(head,35);
        head = InsertDLL.insertEnd(head,40);
        head=deleteBegin(head);
        head=deleteLast(head);
        DLL.printDLL(head);
    }
}
