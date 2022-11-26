public class SelectionSortDemo {

    public void SelectionSort(int A[], int n){
        for (int i=0;i<n-1;i++){
            int position=i;
            for (int j=i+1;j<n;j++)
                if (A[j]<A[position])
                    position=j;
            int temp=A[i];
            A[i]=A[position];
            A[position]=temp;

        }
    }

    public void Display(int A[], int n){
        for (int i=0;i<n;i++)
            System.out.print(A[i] + " " );
        System.out.println();
    }

    public static void main(String args[]) {
        SelectionSortDemo s = new SelectionSortDemo();
        int A[] ={3,5,8,9,78,6};
        System.out.println("Original Array:" );
        s.Display(A,6);
        s.SelectionSort(A,6);
        System.out.println("Sorted Array:" );
        s.Display(A,6);

    }
}
