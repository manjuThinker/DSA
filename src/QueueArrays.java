public class QueueArrays {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueArrays(int n){
        data= new int[n];
        front=0;
        rear=0;
        size=0;
    }
    public int length(){
        return size;
    }
    public boolean Isempty(){
        return size==0;
    }
    public boolean Isfull(){
        return size==data.length;
    }
    public void Enqueue(int e){
        if (Isfull()){
            System.out.println("queue is full");
            return;
        }
        data[rear]=e;
        rear=rear+1;
        size=size+1;
    }
    public int Dequeue(){
        if (Isempty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int e=data[front];
            front=front+1;
            size=size-1;
            return e;
        }
    }
    public void Display(){
        for (int i=front;i<rear; i++)
            System.out.print(data[i]+" ");
        System.out.println();
    }
    public int front1(){
        if (Isempty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else return data[front];
    }

    public static void main (String[] args){
        QueueArrays q= new QueueArrays(8);
        q.Enqueue(5);
        q.Enqueue(6);
        q.Enqueue(7);
        q.Enqueue(8);
        q.Enqueue(9);
        q.Enqueue(3);
        q.Display();
        System.out.println(q.Dequeue());
        q.Display();
        q.front1();
        System.out.println(q.front1());

    }
}
