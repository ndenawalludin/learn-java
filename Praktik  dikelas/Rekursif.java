import java.util.Scanner;
public class Rekursif {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long fak = 1;
        int angka = 0;
        System.out.print("Masukkan angka : ");
        Scanner in = new Scanner(System.in);
        angka = in.nextInt();
        
        for(int i=1; i<=angka; i++){
            fak = i * fak;
        }
        System.out.println("Faktorial dari  "+angka+" adalah "+fak);
    }
}