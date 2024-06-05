//This program is to understand the structure of linked lists
//To create a linked lists, we need Node consisting of data and reference to next node. These can serve as attributes of class Node
class Node{
    int data; //This datatype can be of any datatype
    Node next; //Since this referencing to the same class Node Linked Lists are called Self referencing Data Structures
    Node(int x){ //Constructor
        data =x;
        next =null;
    }
}

public class LinkedListOwn {
    public static void main(String[] args) {
        //Creating three objects which acts as Nodes
        Node head = new Node(10);
        Node temp1 = new Node (20);
        Node temp2 = new Node(30);
        //Linking the nodes
        head.next =temp1;
        temp1.next =temp2;
    }
}
