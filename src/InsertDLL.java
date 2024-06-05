public class InsertDLL {
    static Node1 insertBegin(Node1 head, int data){
        Node1 temp = new Node1(data);
        if (head==null){
            return temp;
        }
        temp.next=head;
        head.prev =temp;
        return temp;
    }

    static Node1 insertEnd(Node1 head, int data){
        Node1 temp =new Node1(data);
        if (head==null){
            return temp;
        }
        Node1 curr = head;
        while
        (curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev =curr;
        return head;
    }

    static Node1 reverseDLL(Node1 head){
        if (head==null){
            return null;
        }
        Node1 prev = null;
        Node1 curr =head;
        while(curr!=null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next= prev;
            curr=curr.prev;
        }
        return prev.prev;
    }

    public static void main(String[] args) {
        Node1 head = new Node1(10);
        Node1 node2 = new Node1(20);
        Node1 node3 = new Node1(30);
        head.next=node2;
        node2.prev =head;
        node2.next =node3;
        node3.prev=node2;
        head = insertBegin(head,5);
        head=insertBegin(head,2);
        head = insertEnd(head,35);
        head = insertEnd(head,40);
        DLL.printDLL(head);
        System.out.println();
        head=reverseDLL(head);
        DLL.printDLL(head);
    }
}
