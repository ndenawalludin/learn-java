import java.util.Scanner;
public class pswitch {
	public static void main ( String[] args){
		System.out.println("====MENU====");
		System.out.println("1. Menghitung Luas Segitiga");
		System.out.println("2. Menghitung Luas Persegi Panjang");
		System.out.println("3. Menghitung Luas Lingkaran");
		Scanner nden = new Scanner (System.in);
		int k;
		double b, c, d;
		double e, f, g;
		double h, i;
		System.out.print("Masukan Pilihan  = ");
		k = nden.nextInt();
		switch (k){
			case 1 :
				System.out.print("Masukan Alas Segitiga = ");
				b = nden.nextDouble();
				System.out.print("Masukan Tinggi Segitiga = ");
				c = nden.nextDouble();
				d = 0.5*b*c;
				System.out.println("Luas Segitiga = " + d);
			break;
			case 2:
				System.out.print("Masukan Panjang = ");
				e = nden.nextDouble();
				System.out.print("Masukan Lebar = ");
				f = nden.nextDouble();
				g = e*f;
				System.out.println("Luas Persegi Panjang = " + g);
			break;
			case 3:
				System.out.println("Phi Lingkaran = 3.14");
				System.out.print("Masukan Jari - Jari Lingkaran = ");
				h = nden.nextDouble();
				i = 3.14*h*h;
				System.out.println("Luas Persegi Panjang = " + i);
			break;
			default:
				System.out.print("Anda Salah Input");
			break;
		}
	}
}