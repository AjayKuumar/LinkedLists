public class DetectLoop {
    static String detectLoop(Node head){
        if (head==null || head.next==null){
            return "No";
        }
        Node curr = head;
        while(curr!=null){
            if (curr.visited){
                return "Yes";
            }
            else{
                curr.visited = true;
                curr=curr.next;
            }
        }
        return "No";
    }
    static boolean Loop(Node head){
        if (head==null || head.next==null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
    }

    static boolean loop(Node head){
        if (head == null){
            return false;
        }
        Node dum = new Node(Integer.MIN_VALUE);
        Node curr = head;
        while (curr!=null){
            if (curr.next==null){
                return false;
            }
            if (curr.next==dum){
                return true;
            }
            Node currNxt = curr.next;
            curr.next  = dum;
            curr =currNxt;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head=new Node(15);
        head.next=new Node(10);
        head.next.next=new Node(12);
        head.next.next.next=new Node(20);
        head.next.next.next.next=new Node(20);
        head.next.next.next.next.next=null;
        System.out.println(detectLoop(head));
        System.out.println(Loop(head));
        System.out.println(loop(head));
    }
}
