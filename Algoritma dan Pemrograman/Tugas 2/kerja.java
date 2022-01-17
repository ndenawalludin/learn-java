import java.util.Scanner;
public class kerja{
	public static void main (String []args){
		char kel;
		int ting;
		Scanner in = new Scanner (System.in);
		
		System.out.print("=== Program Menentukan Kelulusan ===");
        System.out.println("");
		System.out.print("Masukkan Jenis Kelamin (L/P) : ");
		kel = in.next().charAt(0);
		
		if (kel=='L' || kel=='l'){
			System.out.print("Masukkan Tinggi Badan : ");
			ting =in.nextInt();
			
			if (ting >=165){
				System.out.println("Anda dinyatakan lulus");
			}
			else{
				System.out.println("Anda dinyatakan tidak lulus");
			}
		}
		
		else if (kel=='P' || kel=='p'){
			System.out.print("Masukkan Tinggi Badan : ");
			ting =in.nextInt();
			
			if (ting >=160){
			System.out.println("Anda dinyatakan lulus");
			}
			else{
				System.out.println("Anda dinyatakan tidak lulus");
			}
		}
		else {
			System.out.println("EROR !");
		}
	}
	
}