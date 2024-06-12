public class IntersectionPoint {
    static int intersection(Node h1, Node h2){
        if (h1==null || h2 ==null){
            return -1;
        }
        int count1 = 0;
        int count2 = 0;
        Node curr1 = h1;
        Node curr2 = h2;
        while (curr1!=null){
            count1++;
            curr1=curr1.next;
        }
        while (curr2!=null){
            count2++;
            curr2=curr2.next;
        }
        int d = Math.abs(count1-count2);
        if (count1>count2){
            Node curr=h1;
            for (int count =0;count<d; count++){
                curr=curr.next;
            }
            Node sec_curr = h2;
            while(curr!=null && sec_curr!=null){
                if (curr.data==sec_curr.data){
                    return curr.data;
                }
                curr = curr.next;
                sec_curr =sec_curr.next;
            }
            return -1;
        }
        Node curr=h2;
        for (int count =0;count<d; count++){
            curr=curr.next;
        }
        Node sec_curr = h1;
        while(curr!=null && sec_curr!=null){
            if (curr.data==sec_curr.data){
                return curr.data;
            }
            curr = curr.next;
            sec_curr =sec_curr.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node h1 = null;
        h1 = InsertBeginEnd.insertEnd(h1,10);
        h1 = InsertBeginEnd.insetBegin(h1,12);
        h1 = InsertBeginEnd.insetBegin(h1,25);
        h1 = InsertBeginEnd.insetBegin(h1,51);
        h1 = InsertBeginEnd.insetBegin(h1, 70);
        Node h2 = null;
        h2 = InsertBeginEnd.insertEnd(h2,10);
        h2 = InsertBeginEnd.insetBegin(h2,12);
        h2 = InsertBeginEnd.insetBegin(h2,25);
        h2 = InsertBeginEnd.insetBegin(h2,56);
        h2 = InsertBeginEnd.insetBegin(h2, 51);
        h2 = InsertBeginEnd.insetBegin(h2, 21);
        h2 = InsertBeginEnd.insetBegin(h2, 18);
        SingleTraversal.printList(h1);
        System.out.println();
        SingleTraversal.printList(h2);
        System.out.println();
        System.out.println(intersection(h1,h2));

    }
}
