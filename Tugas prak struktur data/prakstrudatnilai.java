import java.util.Scanner;
public class prakstrudatnilai{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		double a;
		System.out.print("Masukan nilai anda = ");
		a = input.nextDouble();
		System.out.println();
		if (a >= 85 && a <= 100){
			System.out.print("Nilai anda adalah A");
		}
		else if (a >= 75 && a <= 84){
			System.out.print("Nilai anda adalah AB");
		}
		else if (a >= 65 && a <= 74){
			System.out.print("Nilai anda adalah B");
		}
		else if (a >= 50 && a <= 64){
			System.out.print("Nilai anda adalah BC");
		}
		else if (a >= 35 && a <= 49){
			System.out.print("Nilai anda adalah C");
		}
		else if (a >= 20 && a <= 34){
			System.out.print("Nilai anda adalah D");
		}
		else if (a >= 0 && a <= 19){
			System.out.print("Nilai anda adalah E");
		}
		else
			System.out.print("ANDA SALAH MENGINPUTKAN DATA!!!");
		
	}
}