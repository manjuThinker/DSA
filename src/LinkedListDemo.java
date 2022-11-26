public class LinkedListDemo {

    class Node {
        int element;
        Node next ;
        public Node(int e, Node n){
            element=e;
            next=n;
        }

    }
    private Node head;
    private Node tail;
    private int size;

    public LinkedListDemo(){
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
        Node newest = new Node(e,null);
        if (isEmpty())
            head=newest;
        else
            tail.next=newest;
        tail=newest;
        size=size+1;

    }
    public void addFirst(int e) {
        Node newest = new Node(e, null);
        if (isEmpty()) {
            head = newest;
            tail = newest;
        } else {
            newest.next = head;
            head = newest;
        }
        size = size + 1;
    }

    public void Addanywhere(int e, int position){
        if (position<=0 || position>=size){
            System.out.println("Invalid position");
            return ;
        }
        Node newest=new Node(e,null);
        Node p=head;
        int i=1;
        while (i<position-1){
            p=p.next;
            i=1+1;
        }
        newest.next=p.next;
        p.next=newest;
        size=size+1;
    }
    public int removefirst(){
        if (isEmpty()){
            System.out.println("List Is empty");
            return -1;
        }
        int e =head.element;
        head=head.next;
        size=size-1;
        if (isEmpty()){
            tail=null;
        }
        return e;

    }
    public int removeLast(){
        if (isEmpty()) {
            System.out.println("List Is empty");
            return -1;
        }    Node p=head;
            int i=1;
            while (i<size-1){
                p=p.next;
                i=i+1;
            }
            tail=p;
            p=p.next;
            int e=tail.element;
            tail.next=null;
            size=size-1;
            return e;
    }
    public int removeAny(int position){
        if (position<=0 || position >= size-1){
            System.out.println("Invalid position");
            return -1;
        }
        Node p =head;
        int i=1;
        while(i<position-1){
            p=p.next;
            i=i+1;
        }
        int e =p.next.element;
        p.next=p.next.next;
        size=size-1;
        return e;
    }
    public int search(int key){
        Node p = head;
        int position =0;
        while (p!=null){
            if(p.element==key)
                return position;
                p=p.next;
                position=position+1;
        }
        return -1;
    }

    public void display() {
        Node p = head;
        while (p!=null) {
            System.out.print(p.element + " -->");
            p = p.next;
        }
        System.out.println();
    }
    public static void main (String[] args){
        LinkedListDemo l= new LinkedListDemo();
l.addLast(56);
        l.addLast(86);
        l.addLast(6);
        l.addLast(5);
        l.addLast(76);

        l.display();
        System.out.println(l.isEmpty());
        l.addFirst(56);
        l.addFirst(86);
        l.addFirst(6);
        l.addFirst(5);
        l.addFirst(65);
        l.addFirst(43);
        l.addFirst(23);
        l.addFirst(43);
        l.addFirst(76);
        l.display();
l.Addanywhere(52,5);

l.display();
        l.removeAny(2);
        l.display();

int element= l.removeAny(4);
        System.out.println("e= " + element);
        l.display();

        l.search(76);
        int search = l.search(56);
        System.out.println("e= " + search);

    }
}
