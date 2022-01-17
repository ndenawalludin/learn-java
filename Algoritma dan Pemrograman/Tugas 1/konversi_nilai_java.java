import java.util.Scanner;
public class konversi_nilai_uden{
	public static void main (String [] args){
		Scanner uden = new Scanner(System.in);
		double nilai;
		System.out.print("Masukan Nilai Anda = ");
		nilai = uden.nextDouble();
		if (nilai>=80 && nilai<=100)
		{
			System.out.print("Selamat Anda Mendapatkan 'A'. Pertahankan!!!");
		}
		else if (nilai>=65 && nilai<80)
		{
			System.out.print("Selamat Anda Mendapatkan 'B'. Tingkatkan!!!");
		}
		else if (nilai>=50 && nilai<65)
		{
			System.out.print("Selamat Anda Mendapatkan 'C'. Tingkatkan!!!");
		}
		else if (nilai>=35 && nilai<50)
		{
			System.out.print("Mohon Maaf Anda Tidak lulus. Nilai Anda 'D'. Tetap Semangat!!!");
		}
		else if (nilai>=0 && nilai<35)
		{
			System.out.print("Mohon Maaf Anda Tidak lulus. Nilai Anda 'E'. Tetap Semangat!!!");
		}
		else 
			System.out.print("Anda Salah Menginputkan Nilai!!!");
	}
}