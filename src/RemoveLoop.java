public class RemoveLoop {
    static Node removeLoop(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node slow = head;
        Node fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast =fast.next.next;
            if (slow==fast){
                break;
            }
        }
        if (slow!=fast){
            return head;
        }
        slow = head;
        while (slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
        return head;
    }

    public static void main(String[] args) {
        Node head=new Node(15);
        head.next=new Node(10);
        head.next.next=new Node(12);
        head.next.next.next=new Node(20);
        head.next.next.next.next=new Node(20);
        head.next.next.next.next.next=head.next;
        head = removeLoop(head);
        SingleTraversal.printList(head);
    }
}
