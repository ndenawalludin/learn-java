import java.util.Arrays;

public class BubbleSortAsc {
	public static void main(String[] args) {

		int[] bilangan = {13, 14, 10, 4, 18, 20, 25, 17};
		
		System.out.println("\nProses Bubble Sort secara Ascending:");
		for(int a = 0; a < bilangan.length; a++) {
			for(int b = 0; b < bilangan.length-1; b++) { if(bilangan[b] > bilangan[b+1]) {
					//	proses pertukaran bilangan
					int temp = bilangan[b];
					bilangan[b] = bilangan[b+1];
					bilangan[b+1] = temp;
				}
				
			}
		}
		
		//	Tampilkan hasil akhir
		System.out.println("\nHasil akhir setelah di sorting: "+Arrays.toString(bilangan));
	}
}
