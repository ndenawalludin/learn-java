import java.util.Scanner;
public class latihan_BS{	//bubblesort
	public static void main (String[] args){
		Scanner nden = new Scanner (System.in);
		int x;
		int arr[] = {1,5,2,4,3,9,7};
		System.out.println("Data sebelum di sort");
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Data sesudah di sort:");
		sort (arr);
		System.out.println();
		System.out.print("Sisipkan angka: ");
		arr[0] = nden.nextInt();
		System.out.println("Data sesudah di sisipkan:");
		sisip (arr);
	}	
		
	static void sort (int[] a){
		int n = a.length;
		for (int i=0; i<n-1; i++){
			for (int j=0; j<n-1; j++){
				if (a[j]>a[j+1]){
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int y = a.length;
			for (int k=0; k<a.length; k++){
				System.out.print(a[k]+" ");
		}
	}
	
	static void sisip (int[] a){
		int n = a.length;
		for (int i=0; i<n-1; i++){
			for (int j=0; j<n-1; j++){
				if (a[j]>a[j+1]){
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int y = a.length;
			for (int k=0; k<a.length; k++){
				System.out.print(a[k]+" ");
		}
	}
}