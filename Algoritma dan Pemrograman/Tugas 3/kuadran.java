import java.util.Scanner;
public class kuadran{
	public static void main ( String [] args ){
		Scanner nden = new Scanner (System.in);
		System.out.println("\t\t\t\t============================");
		System.out.println("\t\t\t\t  MENGETAHUI TITIK KUADRAN");
		System.out.println("\t\t\t\t============================\n");
		System.out.print("Masukan Titik 'X' = ");
		int a = nden.nextInt();
		System.out.print("Masukan Titik 'Y' = ");
		int b = nden.nextInt();
		if (a>0&&b>0)
		{
			System.out.print("\nBerada di Kuadran 1");
		}
		else if (a<0&&b>0)
		{
			System.out.print("\nBerada di Kuadran 2");
		}
		else if (a<0&&b<0)
		{
			System.out.print("\nBerada di Kuadran 3");
		}
		else
			System.out.print("\nBerada di Kuadran 4");
	}
}