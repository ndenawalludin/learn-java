import java.util.Scanner;
public class ndentiga {
    public static void main(String[] args){
        Scanner nden = new Scanner( System.in );
        int a, b, c;
		int terbesar, terkecil;
        System.out.print("Masukkan Angka Pertama = ");a=nden.nextInt();
        System.out.print("Masukkan Angka Kedua= ");b=nden.nextInt();
        System.out.print("Masukkan Angka Ketiga= ");c=nden.nextInt();
        terbesar=(a>b)?a:b;
        terbesar=(terbesar>c)?terbesar:c;
		terkecil=(a<b)?a:b;
		terkecil=(terkecil<c)?terkecil:c;
        System.out.println("\nNilai Maksimum adalah = "+terbesar);
        System.out.println("Nilai Minimum Adalah = "+terkecil);
    }
}