public class BinarySearchRecurssive {

    public int BinarySearchRec(int A[], int key, int left, int right) {
        if (left > right)
            return -1;
        else {
            int mid = (left + right) / 2;
            if (key == A[mid])
                return mid;
            else if (key < A[mid])
                return BinarySearchRec(A, key, left, mid - 1);
            else if (key > A[mid])
                return BinarySearchRec(A, key, mid+1, right);
        }
        return -1;
    }
    public static void main(String args[]) {
        BinarySearchRecurssive b = new BinarySearchRecurssive();
        int A[] = {84, 21, 47, 96, 15};
        int found = b.BinarySearchRec(A, 96, 0, A.length - 1);
        System.out.println("Result " + found);
    }


}
