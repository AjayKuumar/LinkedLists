public class SortedInsert {
    static Node sortedInsert(Node head,int data){
        Node temp = new Node(data);
        if (head==null || head.data>data){
            //If head is null or if head data is greater than x then we need to insert at begin and return new head
            return InsertBeginEnd.insetBegin(head,data);

        }
        Node curr = head;

        //We will move to sorted order position if not present then x must be larger than all elements
        //So we move to last element
        while(curr.next!=null && curr.next.data<data){
            curr=curr.next;
        }

        //Make next of curr as temp and next of temp as next of curr
        temp.next =curr.next;
        curr.next =temp;
        //head will remain in this case
        return head;

        //Time Complexity is O(n)
    }

    public static void main(String[] args) {
        Node head = null;
        head = sortedInsert(head,10);
        head = sortedInsert(head,25);
        head = sortedInsert(head, 15);
        head = sortedInsert(head, 5);
        head = sortedInsert(head, 30);
        SingleTraversal.printList(head);
    }
}
