public class binarySearchDemo {

    public int BinarySearch(int A[], int n, int key) {
        /*int m=0;
        for (m=0; m<A.length; m++) ---this block is for test
            System.out.println(m);*/
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key == A[mid])
                return mid;
            else if (key < A[mid])
                right = mid - 1;
            else if (key > A[mid])
                left = mid + 1;
        }
        return -1;
    }

    public static void main(String args[]) {
            binarySearchDemo b = new binarySearchDemo();
            int A[] ={15,21,47,84,96,200,789,765};
            int found = b.BinarySearch(A, 5,96);
            System.out.println("Result " + found);

    }
}
