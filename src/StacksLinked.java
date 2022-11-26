public class StacksLinked {

    class Node{
        int element;
        Node next;

        public Node(int e, Node n){
            element=e;
            next=n;
        }
    }
    private Node top;
    private int size;

    public StacksLinked(){
        top=null;
        size=0;
    }
    public int length(){
        return size;
    }

    public boolean Isempty(){
        return size==0;
    }
    public void push(int e){
        Node newest=new Node(e, null);
        if (Isempty()){
            top=newest;
        }
        else {
            newest.next=top;
            top=newest;
        }
        size=size+1;
    }
    public int pop(){
        if (Isempty()){
            System.out.println("Stack is empty");
            return -1;
        }

        int e =top.element;
        top=top.next;
        size=size-1;
        return e;
    }
    public int peak(){
        if (Isempty()){
            System.out.println("Stacks are empty");
            return -1;
        }
        else return top.element;
    }
    public void Display(){
        Node p =top;
        while (p!=null){
            System.out.println(p.element);
            p=p.next;
        }
        System.out.println();
    }
    public static void main (String[] args){
        StacksLinked s= new StacksLinked();
        s.peak();
        s.push(5);
        s.push(4);
        s.push(9);
        s.push(2);
        s.push(6);
        s.peak();
        s.Display();
        System.out.println(s.peak());


    }
}
