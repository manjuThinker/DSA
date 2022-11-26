public class CircularLinkedList {
    class Node{
        int element;
        Node next;
        public Node (int e, Node n){
            element=e;
            next=n;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList(){
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
        Node newest = new Node( e,null);
        if (isEmpty()){
            newest.next=newest;
            head=newest;
        }
        else {
            newest.next=tail.next;
            tail.next=newest;
        }
        tail=newest;
        size=size+1;
    }
    public void addFirst(int e){
        Node newest = new Node( e,null);
        if (isEmpty()){
            newest.next=newest;
            head=newest;
            tail=newest;
        }
        else {
            tail.next=newest;
            newest.next=head;
            head=newest;
        }

        size=size+1;
    }

    public void addAny(int e, int position){
        if (position<=0 ||position>=size){
            System.out.println("Inavlid position");
            return;
        }
        Node newest = new Node(e,null);
        Node p=head;
        int i=1;
        while (i<position-1){
            p=p.next;
            i=i+1;
        }
        newest.next=p.next;
        p.next=newest;
        size=size+1;

    }
    public int removeFirst(){
        if (isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        int e=head.element;
        tail.next=head.next;
        head=head.next;
        size=size-1;

        if (isEmpty()){
            head=null;
            tail=null;
        }
        return e;
    }
    public boolean removelast(){
        if (isEmpty()) {
            System.out.println("List is empty");
            return false;
        }
        Node p = head;
        int i = 1;
        while (i < length()- 1) {
            p = p.next;
            i = i + 1;
        }
        System.out.println(p.next.element);
        p.next=tail;
        tail.next=head;
        size=size-1;
        removelast();
       /* tail=p;
        p=p.next;
        tail.next=head;
        int e = p.element;
        size=size-1;
        return e;*/
        return false;
    }

    public int removeAny(int position){
        if(position<=0 || position>=size-1){
            System.out.println("Invalid List");
            return -1;
        }
        Node p= head;
        int i=1;
        while (i<position-1){
            p=p.next;
             i=i+1;
        }
        int e= p.next.element;
        p.next=p.next.next;
        size=size-1;
        return e;
    }
    public void display(){
        Node p=head;
        int i=0;
        while (i<length()){
            System.out.print(p.element+"-->");
            p=p.next;
            i=i+1;
        }
        System.out.println();
    }
    public static void main (String[] args) {
        CircularLinkedList c = new CircularLinkedList();
       /* c.addLast(56);
        c.addLast(86);
        c.addLast(6);
        c.addLast(5);
        c.addLast(76);*/
        c.display();
        c.addFirst(576);
        c.addFirst(86);
        c.addFirst(6);
        c.addFirst(5);
        c.addFirst(65);
        c.addFirst(97);
        c.display();
        c.removeAny(2);
        c.display();
        c.display();
    }
}


