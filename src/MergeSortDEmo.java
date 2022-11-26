public class MergeSortDEmo {

    public void MergeSort(int A[], int left, int right){
        if (left<right){
            int mid=(left+right)/2;
            MergeSort(A, left, mid);
            MergeSort(A, mid+1, right);
            Merge(A, left, mid, right);
        }
    }

    public void Merge(int[] a, int left, int mid, int right) {
        int i=left;
        int j=mid+1;
        int k=left;
        int B[]=new int[right+1];

    }

}
