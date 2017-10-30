public class Queue {
    Nodes top;
    Nodes bottom;

    void enqueue(int d){
        Nodes n = new Nodes(d);
        if (top == null){
            top = n;
        }
        bottom.next = n;
        bottom = n;
    }

    Nodes dequeue(){
        if(top == null){
            return null;
        }
        else{
            Nodes temp = top;
            top = top.next;
            return temp;
        }
    }
}
