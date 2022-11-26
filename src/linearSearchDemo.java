public class linearSearchDemo {

    public int linearSearch(int A[], int n, int key) {
        int index=0;
        while (index < n){
            if (A[index]==key)
                return index;
            index = index+1;
        }
        return -1;
    }

    public static void main(String args[]) {
        linearSearchDemo l = new linearSearchDemo();
        int A[] = {84,21,47,96,15};
        l.linearSearch(A,5,96);
        int found = l.linearSearch(A,5,15);
        System.out.println("Result "+ found);
    }
}
