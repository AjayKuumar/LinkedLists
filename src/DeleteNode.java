public class DeleteNode {
    static void deleteNode(Node node){
        node.data=node.next.data;
        node.next =node.next.next;
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        Node ptr=new Node(30);
        head.next.next=ptr;
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(25);
        SingleTraversal.printList(head);
        deleteNode(ptr);
        System.out.println();
        SingleTraversal.printList(head);
    }
}
