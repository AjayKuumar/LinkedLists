public class InsertCLL {
    static Node2 insertBegin(Node2 head,int data){
        Node2 temp = new Node2(data);
        if (head==null){
            temp.next=temp;
            return temp;
        }
        temp.next = head.next; //just inserting the temp after head node
        head.next = temp;
        //Swapping the data of head and node for better time complexity O(1)
        int hdata = head.data;
        head.data=temp.data;
        temp.data = hdata;
        return head; //No need to change the head as we are swapping the data of head and temp
    }

    static Node2 insertEnd(Node2 head,int data){
        Node2 temp = new Node2(data);
        if (head==null){
            temp.next=temp;
            return temp;
        }
        temp.next = head.next; //just inserting the temp after head node
        head.next = temp;
        //Swapping the data of head and node for better time complexity O(1)
        int hdata = head.data;
        head.data=temp.data;
        temp.data = hdata;
        return temp; //same as previous one but instead of returning head we return temp
        //because we swapped the nodes and there is no change of head if we add node at end
    }

    public static void main(String[] args) {
        Node2 head=new Node2(10);
        head.next=new Node2(5);
        head.next.next=new Node2(20);
        head.next.next.next=new Node2(15);
        head.next.next.next.next=head;
        head = insertBegin(head,2);
        head = insertEnd(head,25);
        CLL.printlist(head);
    }
}
