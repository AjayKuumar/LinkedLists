class Node1{
    int data;
    Node1 next;
    Node1 prev;

    Node1(int x){
        data = x;
    }
}
public class DLL {
    static void printDLL(Node1 head){
        Node1 curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {

    }
}
