public class Nodes {
    Nodes next = null;
    int data;


    public Nodes(int d){
        data = d;
    }

    public void appendtotail(int d){
        Nodes end = new Nodes(d);
        Nodes n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    public Nodes delete(Nodes head, int d){
        Nodes n = head;
        Nodes prev = n;
        if (n.data == d){
            return head.next;
        }
        while(n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return null;
    }


}
