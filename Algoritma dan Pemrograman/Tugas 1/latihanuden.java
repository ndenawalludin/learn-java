/* Jumlah total pembelian=
Jumlah Barang=
jika pembelian lebih dari 500000 dan jumlah barang lebih dari 5 mendapatkan bonus Setrika
jika pembelian lebih dari 100000 dan jumlah barang lebih dari 3 mendapatkan bonus Payung
jika pembelian lebih dari 50000 dan jumlah barang lebih dari 2 mendapatkan bonus Ballpoint
*/

import java.util.Scanner;
public class latihanuden {
	public static void main (String[]args){
		Scanner uden=new Scanner(System.in);
		int p,b ;
		System.out.print("masukan jumlah total pembelian:");
		p=uden.nextInt();
		System.out.print("masukan jumlah barang :");
		b=uden.nextInt();
		if (p>500000){
			if (b>5){
				System.out.print("mendapatkan bonus setrika");
			}
		}
		else if (p>100000){
			if (b>3){
				System.out.print("mendapatkan bonus payung");
			}
		}
        else if (p>50000){
			if (b>2){
				System.out.print("mendapatkan bonus ballpoint");
			}
		}
		else {
			System.out.print("tidak mendapatkan apa apa");
		}

		
	}
}