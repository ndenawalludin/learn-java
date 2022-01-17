import java.util.Scanner;
public class upah_karyawan{
	public static void main ( String [] args ){
		Scanner nden = new Scanner (System.in);
		System.out.println("\t\t\t\t==================");
		System.out.println("\t\t\t\t  UPAH KARYAWAN");
		System.out.println("\t\t\t\t==================\n");
		System.out.println("=====GOLONGAN=====");
		System.out.println("1. GOLONGAN A");
		System.out.println("2. GOLONGAN B");
		System.out.println("3. GOLONGAN C");
		System.out.println("4. GOLONGAN D\n");
		System.out.print("INPUT GOLONGAN (1-4) = ");
		int a = nden.nextInt();
		if(a==1)
		{
			System.out.println("===GOLONGAN A===");
			System.out.print("Berapa Jam Anda Bekerja = ");
			int b = nden.nextInt();
			float c = b*4000;
			System.out.print("UPAH KARYAWAN = "+c);
			
		}
		else if(a==2)
		{
			System.out.println("===GOLONGAN B===");
			System.out.print("Berapa Jam Anda Bekerja = ");
			int d = nden.nextInt();
			float e = d*5000;
			System.out.print("UPAH KARYAWAN = "+e);
			
		}
		else if(a==3)
		{
			System.out.println("===GOLONGAN C===");
			System.out.print("Berapa Jam Anda Bekerja = ");
			int f = nden.nextInt();
			float g = f*6000;
			System.out.print("UPAH KARYAWAN = "+g);
			
		}
		else if(a==4)
		{
			System.out.println("===GOLONGAN B===");
			System.out.print("Berapa Jam Anda Bekerja = ");
			int h = nden.nextInt();
			float i = h*7500;
			System.out.print("UPAH KARYAWAN = "+i);
			
		}
		else
			System.out.print("\nAnda Salah Mengiputkan Golongan.\nSilahkan Coba lagi");
	}
}