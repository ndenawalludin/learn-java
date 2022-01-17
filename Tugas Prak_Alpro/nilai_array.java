/* no	nim		nama	nilai1 	nilai2	nilai3	rata-rata	nilai huruf		keterangan */
import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;

public class nilai_array {
    
    public static void main(String[] args){

        //Inisialisasi
        Scanner nden = new Scanner(System.in);
        int mhs,jml, banyakTes = 3, nilai[][], ntt[], ntr[];
        float rata[], jumlah[], rtt, rtr;
        
        //Input jumlah mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        mhs = nden.nextInt();
        
        //Inisialisasi Array
        nilai = new int[mhs][banyakTes];
        jumlah = new float[mhs];
        rata = new float[mhs];
        ntt = new int[banyakTes];
        ntr = new int[banyakTes];
		String[] nama = new String[15];
        System.out.println();
        //Input Nilai
        for(int h=0;h<mhs;h++){ //Mahasiswa
            System.out.print("Nama = ");
			
			nama [h] = nden.next();
			System.out.print("NIM = ");
			int nim=nden.nextInt();
            
            for(int i=0;i<banyakTes;i++){ //Tes keberapa       
                System.out.print("Nilai Tes " + (i+1) + " : ");
                nilai[h][i] = nden.nextInt();
                
                //Hitung Jumlah Tes
                jumlah[h] = jumlah[h] + nilai[h][i];
            }
            //Hitung rata-rata tes
            rata[h] = jumlah[h]/banyakTes;
            System.out.println();
        }
       
        //Nilai awal tertinggi & terendah
        for(int i=0;i<banyakTes;i++){
            ntt[i] = nilai[0][i];
            ntr[i] = nilai[0][i];
        }
        
        //Nilai awal rata-rata tertinggi & terendah
        rtt = rata[0];
        rtr = rata[0];
		
/* no	nim		nama	nilai1 	nilai2	nilai3	rata-rata	nilai huruf		keterangan */

        //Cari nilai tertinggi & terendah
        for(int i=0;i<banyakTes;i++){
            for(int j=0;j<mhs;j++){
                if(ntt[i] < nilai[j][i]){
                    ntt[i] = nilai[j][i];
                }
                if(ntr[i] > nilai[j][i]){
                    ntr[i] = nilai[j][i];
                }
            }
        }
        
        //Cari nilai rata-rata tertinggi & terendah
        for(int i=0;i<mhs;i++){
            if(rtt < rata[i]){
                    rtt = rata[i];
                }
                if(rtr > rata[i]){
                    rtr = rata[i];
                }
        }
       
        //Output judul
        System.out.println("					============================");
        System.out.println("				   	|| DAFTAR NILAI MAHASISWA ||");
        System.out.println("					============================");
        System.out.println();
        
		System.out.println("++===++=======++===========++===========++===========++==============++===============++=============++");
        System.out.println("||NO ||	NAMA  ||   NILAI 1 ||   NILAI 2 ||   NILAI 3 ||   RATA-RATA  ||   NILAI HURUF ||  KETERANGAN ||");
		System.out.println("++===++=======++===========++===========++===========++==============++===============++=============++");
        
        //Output nilai
        for(int j=0;j<mhs;j++){
            System.out.print("|| "+(j+1)+" ||	"+""+nama[j]+"  ||");
            for(int k=0;k<banyakTes;k++){
				DecimalFormat df = new DecimalFormat("#");
                System.out.print("    "+df.format (nilai[j][k])+"     ||");
				
            }
			DecimalFormat df = new DecimalFormat("#");
            System.out.print("\t    " +df.format (rata[j])+"       ||");
			if (rata[j]>=80 && rata[j]<=100)
			{
				System.out.println("	       A      ||   LULUS     ||");
			}
			else if (rata[j]>=70 && rata[j]<=80)
			{
				System.out.println("	       B      ||   LULUS     ||");
			}
			else if (rata[j]>60 && rata[j]<=70)
			{
				System.out.println("	       C      ||   LULUS     ||");
			}
			else if (rata[j]>0 && rata[j]<=60)
			{
				System.out.println("	       D      || TIDAK LULUS ||");
			}
			else
			{
				System.out.println("SALAH INPUT!!!");
			}
			System.out.println("++===++=======++===========++===========++===========++==============++===============++=============++");

        }
        
        System.out.println();
        
        //Output nilai tertinggi
        System.out.print("Nilai Tertinggi\t");
        for(int j=0;j<banyakTes;j++){//Nilai tertinggi
            System.out.print(ntt[j] + "\t");
        }
        System.out.print(rtt);//Rata-rata tertinggi
        System.out.println();
        
        //Output nilai terendah
        System.out.print("Nilai Teredah\t");
        for(int j=0;j<banyakTes;j++){//Nilai terendah
            System.out.print(ntr[j] + "\t");
        }
        System.out.print(rtr);//Rata-rata terendah
        System.out.println();
    
    }    
}