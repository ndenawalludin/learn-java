import java.util.Scanner;
public class menu {
	public static void main (String[]args){
		int pil;
		
		System.out.println("===== Program memilih menu =====");
		System.out.println("");
		System.out.println("1.Nasi Goreng 	Harga Rp. 11.000");
		System.out.println("2.Nasi Kuning 	Harga Rp.  8.000");
		System.out.println("3.Nasi Uduk   	Harga Rp.  7.500");
		System.out.println("4.Nasi Padang 	Harga Rp. 15.000");
		System.out.println("");
		Scanner input = new Scanner (System.in);
		System.out.print("Masukkan Menu yg Anda Inginkan : ");
		pil = input.nextInt ();
		
		switch (pil){
			case 1:
			System.out.println("Anda Memilih Nasi Goreng");
			System.out.println("Harga Rp. Rp. 11.000");
			break;
			
			case 2:
			System.out.println("Anda Memilih Nasi Kuning");
			System.out.println("Harga Rp. Rp. 8.000");
			break;
			
			case 3:
			System.out.println("Anda Memilih Nasi Uduk");
			System.out.println("Harga Rp. Rp. 7.500");
			break;
			
			case 4:
			System.out.println("Anda Memilih Nasi Padang");
			System.out.println("Harga Rp. Rp. 15.000");
			break;
			
			default:
			System.out.println("Menu yg anda pilih tidak terdaftar !");
			
		}
	}
}