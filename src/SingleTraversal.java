public class SingleTraversal {
    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    static void printListRecursive(Node temp){
        if (temp==null){
            return ;
        }
        System.out.print(temp.data+" ");
        printListRecursive(temp.next);
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node (20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        //Linking the nodes
        head.next =temp1;
        temp1.next =temp2;
        temp2.next=temp3;
        printList(head);
        System.out.println();
        printListRecursive(head);
    }
}
