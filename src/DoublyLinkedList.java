public class DoublyLinkedList {
    class Node{
        int element;
        Node next;
        Node prev;
    public Node(int e, Node n, Node p){
            element = e;
            next = n;
            prev = p;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        head=null;
        tail=null;
        size=0;
    }
    public int length(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void addLast(int e){
        Node newest = new Node(e,null,null);
        if (isEmpty()){
            head=newest;
            tail=newest;
        }
        else{
            tail.next=newest;
            newest.prev=tail;
            tail=newest;
        }
        size=size+1;
    }
    public void addFirst(int e) {
        Node newest = new Node(e, null, null);
        if (isEmpty()){
            head=newest;
            tail=newest;
        }
        else {
            newest.next=head;
            head.prev=newest;
            head=newest;
        }
        size=size+1;
    }
    public void addAny(int e, int position){
        if(position<=0 ||position>=size){
            System.out.println("Invalid postion");
            return;
        }
        Node newest =new Node( e, null, null);
        Node p=head;
        int i=1;
        while (i<position-1){
            p=p.next;
            i=i+1;
        }
        newest.next=p.next;
        p.next.prev=newest;
        p.next=newest;
        newest.prev=p;
        size=size+1;
    }
    int removeFirst(){
        if (isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        int e=head.element;
        head=head.next;
        size=size-1;

        if (isEmpty()){
            tail=null;
        }
        else {
            head.prev=null;
        }
        return e;
    }
    public int removeLast(){
        if (isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        int e= tail.element;
        tail=tail.prev;
        tail.next=null;
        size=size-1;
        return e;
    }
    /*public int removeAny(int position){
        if (position<=0 || position>=size-1){

        }
    }*/
    public void display(){
        Node p=head;
        while (p!=null){
            System.out.print(p.element+"-->");
            p=p.next;
        }
        System.out.println();
    }
    public static void main (String[] args){
        DoublyLinkedList d=new DoublyLinkedList();
        DoublyLinkedList addAny =new DoublyLinkedList();
        d.addLast(7);
        d.addLast(6);
        d.addLast(4);
        d.addLast(9);
        d.addLast(1);
        d.addLast(3);
        d.addLast(76);
        d.display();
        d.addAny(5,5);
        d.display();
        addAny.addLast(56);
        addAny.addLast(76);
        addAny.display();
        addAny.removeFirst();
        addAny.display();
        System.out.println(addAny.removeFirst());
    }
}
