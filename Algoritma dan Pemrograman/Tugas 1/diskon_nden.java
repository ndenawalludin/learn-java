import java.util.Scanner;
public class diskon_nden{
	public static void main (String [] args){
		Scanner nden = new Scanner (System.in);
		int pmbln, jmlh_brg;
		System.out.print("Jumlah Total Pembelian = ");
		pmbln = nden.nextInt();
		System.out.print("Jumlah Barang = ");
		jmlh_brg = nden.nextInt();
		if (pmbln>=500000)
		{
			if (jmlh_brg>5)
			{
				System.out.print("Selamat Anda Mendapatkan Bonus Setrika");
			}
			else
			System.out.print("Anda Tidak Mendapatkan Bonus");
		}
		else if (pmbln>=100000)
		{
			if (jmlh_brg>3)
			{
				System.out.print("Selamat Anda Mendapatkan Bonus Payung");
			}
			else
			System.out.print("Anda Tidak Mendapatkan Bonus");
		}
		else if (pmbln>=50000)
		{
			if (jmlh_brg>2)
			{
				System.out.print("Selamat Anda Mendapatkan Bonus Ballpoint");
			}
			else
			System.out.print("Anda Tidak Mendapatkan Bonus");
		}
		else
			System.out.print("Anda Tidak Mendapatkan Bonus");
	
	}
}