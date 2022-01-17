import java.util.Scanner;
public class ndendua {
	public static void main ( String[] args){
		System.out.println("====MENU====");
		System.out.println("1. Menghitung Luas Segitiga");
		System.out.println("2. Menghitung Luas Persegi Panjang");
		System.out.println("3. Menghitung Luas Lingkaran");
		Scanner nden = new Scanner (System.in);
		int k;
		double a, b, c, d;
		double e, f, g;
		double h, i, j;
		for (k=0; k<=3; k++)
		{
			System.out.print("\nMasukkan Pilihan = ");
			a = nden.nextDouble();
			if (a==1)
			{
				System.out.print("Masukan Alas Segitiga = ");
				b = nden.nextDouble();
				System.out.print("Masukan Tinggi Segitiga = ");
				c = nden.nextDouble();
				d = 0.5*b*c;
				System.out.println("Luas Segitiga = " + d);
			}
			else if (a==2)
			{
				System.out.print("Masukan Panjang = ");
				e = nden.nextDouble();
				System.out.print("Masukan Lebar = ");
				f = nden.nextDouble();
				g = e*f;
				System.out.println("Luas Persegi Panjang = " + g);
			}
			else if (a==3)
			{
				System.out.println("Phi Lingkaran = 3.14");
				System.out.print("Masukan Jari - Jari Lingkaran = ");
				h = nden.nextDouble();
				i = 3.14*h*h;
				System.out.println("Luas Persegi Panjang = " + i);
			}
			else
			{
				System.out.println("Anda Salah Input");
			}
		}
	}
}