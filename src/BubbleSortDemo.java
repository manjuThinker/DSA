public class BubbleSortDemo {
    public void BubbleSort(int Arr[], int n){
        for (int pass=n-1;pass>=0;pass--){
            for (int i=0;i<pass;i++){
                if (Arr[i]>Arr[i+1]) {
                    int temp = Arr[i];
                    Arr[i] = Arr[i + 1];
                    Arr[i + 1] = temp;
                }

            }
        }
    }

    public void Display(int Arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(Arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        BubbleSortDemo b= new BubbleSortDemo();
        int Arr[] = {10, 100, 56, 34, 78, 6,45,85};
        System.out.println("Original Array");
        int bow = Arr.length;
        b.Display(Arr, bow);
        b.BubbleSort(Arr, bow);
        System.out.println("Sorted Array");
        b.Display(Arr, bow);
    }
}
