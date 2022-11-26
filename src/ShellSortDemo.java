public class ShellSortDemo {


    public void ShellSort(int A[], int n){
        int gap=n/2;
        while (gap>0){
            int i=gap;
            while (i<n){
                int temp=A[i];
                int j=i-gap;
                while (j>=0 && A[j]>temp){
                    A[j+gap]=A[j];
                    j=j-gap;
                }
                A[j+gap]=temp;
                i=i+1;
            }
            gap=gap/2;
        }
    }

    public void Display(int A[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + " # ");
        System.out.println();
    }
    public static void main(String args[]) {
        ShellSortDemo s = new ShellSortDemo();
        int A[] = {10, 100, 56, 34, 78, 6, 67, 9, 5, 4};
        System.out.println("Original Array:");
        s.Display(A, A.length);
        s.ShellSort(A, A.length);
        System.out.println("Sorted Array:");
        s.Display(A, A.length);
    }
}
