import java.util.Scanner;
public class ndensatu {
	public static void main (String[]args){
		System.out.println("Menentukan Bilangan Ganjil dan Genap\n");
		Scanner nden = new Scanner (System.in);
		int bil, a, b;
		System.out.print("Masukan Banyak Bilangan = ");
		bil = nden.nextInt();
		for (a=1; a<=bil; a++)
		{
			
			System.out.print("Masukkan Bilangan = ");
			b = nden.nextInt();
			if (b%2==0)
			{
				System.out.println("Genap\n");
			}
			else if (b%2!=0)
			{
				System.out.println("Ganjil\n");
			}
		}
	}
}