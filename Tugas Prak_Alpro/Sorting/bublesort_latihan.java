import java.util.Scanner;
public class bublesort_latihan{
	public static void main(String[] args){
		Scanner nden = new Scanner (System.in);
	int[10] arr = {5,24,12,7,3,13};
		System.out.println("Data sebelum di sort : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}	
		sort(arr);
		System.out.println();
		System.out.println("Data sesudah di sort : ");
		print(arr);
		System.out.print("Sisipkan data: ");
		int arr [y] = nden.nextInt();
		System.out.println("Data yang sudah di sisipkan: ");
		
	}
	static void sort(int a[]){
		int n = a.length;
		for (int i=0;i<n-1;i++){
			for (int j=0;j<n-1;j++){
				if (a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	static void print(int[] x){
		int n = x.length;
		for (int i=0;i<x.length;i++){
			System.out.print(x[i] + " ");
		}
	}
}
