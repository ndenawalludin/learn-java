import java.util.Hashtable;
import java.util.Set;
import java.util.Scanner;
import java.util.Collection;
import java.util.Enumeration;

public class HashtableKamus_Nden
{
	public static void main (String[]args)
	{
		Enumeration names;
		Hashtable <String, String>companies = new Hashtable<String, String>();
		
		companies.put("CPU", "perangkat keras komputer yang memahami dan melaksanakan perintah dan data dari perangkat lunak.");
		companies.put("VGA", "singkatan dari Video Graphics Array yang merupakan tipe standar koneksi untuk perangkat video seperti monitor dan proyektor.");
		companies.put("RAM", "suatu memori tempat penyimpanan data sementara, ketika saat komputer dijalankan dan dapat diakses secara acak (random).");
		companies.put("Monitor", "salah satu jenis soft-copy device, karena keluarannya adalah berupa sinyal elektronik, dalam hal ini berupa gambar yang tampil di layar monitor.");
		companies.put("Harddisk", "sebuah komponen perangkat keras yang menyimpan data sekunder dan berisi piringan magnetis.");
		companies.put("Keyboard", "alat input dan merupakan salah satu perangkat keras komputer yang memiliki macam-macam tombol yang memiliki fungsi yang berbeda tergantung pada penekanannya yang dapat menghasilkan proses sesuai dengan kemauan kita.");
		companies.put("Mouse", "peranti penunjuk yang digunakan untuk memasukkan data dan perintah ke dalam komputer selain papan ketik. ");
		companies.put("Speaker", "perangkat keras yang berfungsi untuk mengeluarkan suara.");
		companies.put("Printer", "peranti yang menampilkan data dalam bentuk cetakan, baik berupa teks maupun gambar/grafik, di atas kertas.");
		companies.put("LAN", "jaringan komputer yang jaringannya hanya mencakup wilayah kecil.");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Kamus Informatika");
		System.out.println("Cari Istilah ke-Informatikaan : ");
		String cari = input.next();
		
		companies.get(cari);
		System.out.println(cari+ " adalah : " + companies.get(cari));
	}
}