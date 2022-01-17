public class Quicksort {
    public static int i,p,pivot;
    public static void main(String[] args) {
        int A [] = {39,99,19,9,12,10,33};
        System.out.print("Array A = ");
        for (int z = 0; z < A.length; z++) {
         System.out.print(A[z]+"   ");
        }
        System.out.println();
        
        QuickSort(A, 0, A.length-1);
        System.out.println("\nSetelah diurutkan : ");
        for (int z = 0; z < A.length; z++) {
            System.out.print(A[z]+"   ");
            }
            System.out.println();
    }
   
    public static void QuickSort(int []A, int lo,int hi){
        if (lo < hi){
            p = partition(A,lo,hi);
            QuickSort(A, lo, p-1);
            QuickSort(A, p+1, hi);
          
        }
    }
   
    public static int partition(int [] A, int lo, int hi){
        pivot = A[hi];
        i = lo;
        int j;
        for (j = lo; j <= hi-1; j++){
            if (A[j] <= pivot){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i = i+1;
            }
        }
        int tp = A[i];
        A[i] = A[hi];
        A[hi] = tp;
        return i;
        
    }
}