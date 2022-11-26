public class InsertionSortDemo {

    public void InsertionSort(int A[], int n) {
        for (int i = 1; i < n; i++) {
            int Cvalue = A[i];
            int position = i;
            while (position > 0 && A[position - 1] > Cvalue) {
                A[position] = A[position - 1];
                position = position - 1;

            }
            A[position] = Cvalue;

        }
    }

    public void Display(int A[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
       InsertionSortDemo i = new InsertionSortDemo();
        int A[] = {10, 100, 56, 34, 78, 6};
        System.out.println("Original Array:");
        i.Display(A, 6);
        i.InsertionSort(A, 6);
        System.out.println("Sorted Array:");
        i.Display(A, 6);
    }
}
