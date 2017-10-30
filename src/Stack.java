public class Stack {
    //pop()
    //push()
    //peek()
    //empty()

    Nodes top;

    boolean isempty(){
        return top == null;
    }
    Nodes pop(){
        if(isempty()){
            return null;
        }
        else{
            Nodes temp = top;
            top = top.next;
            return temp;
        }
    }

    void push(int d){
        Nodes n = new Nodes(d);
        n.next = top;
        top = n;
    }
}
