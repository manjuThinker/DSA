public class QuesesLinkedList {

    class Node{
        Object element;
        Node next;
        public Node(Object e, Node n){
            element=e;
            next=n;
        }
    }
    private Node Front;
    private Node Rear;
    private int size;

    public QuesesLinkedList(){
        Front=null;
        Rear=null;
        size=0;
    }
    public int length(){
        return size;
    }
    public boolean Isempty(){
        return size==0;
    }
    public void Enqueue(Object e){
        Node newest = new Node(e,null);
        if (Isempty()){
            Front=newest;
        }
        else {
            Rear.next=newest;
        }
        Rear=newest;
        size=size+1;
    }
    public Object Dequeue(){
        if (Isempty()){
            System.out.println("Queue is empty");
            return -1;
        }
        Object e= Front.element;
        Front=Front.next;
        size=size-1;
        if (Isempty()){
            Rear=null;
        }
        return e;
    }
}
