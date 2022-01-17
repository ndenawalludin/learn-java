import javax.swing.*; 
public class ari {
    
    public static void main(String[] args) {
        System.out.println("kalkulator");
        System.out.println("===========================");

        System.out.println("Masukan Pilihan Anda");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("===========================");
        
        double hsl;
        String psn=JOptionPane.showInputDialog("Masukan pilihan :");
        int jns=Integer.parseInt(psn);
        switch (jns){
            case 1: System.out.println("Penjumlahan");
                    String bil1=JOptionPane.showInputDialog("Masukan angka pertama : ");
                    String bil2=JOptionPane.showInputDialog("Masukan Angka Kedua : ");
                    int a1=Integer.parseInt(bil1);
                    int a2=Integer.parseInt(bil2);
                    hsl=a1+a2;
                    System.out.println("Hasil "+bil1+"+"+bil2+"="+hsl);
                    break;
            case 2: System.out.println("Pengurangan");
                    String bil3=JOptionPane.showInputDialog("Masukan angka pertama : ");
                    String bil4=JOptionPane.showInputDialog("Masukan Angka Kedua : ");
                    int a3=Integer.parseInt(bil3);
                    int a4=Integer.parseInt(bil4);
                    hsl=a3-a4;
                    System.out.println("Hasil "+bil3+"-"+bil4+"="+hsl);
                    break;
            
        }    
    }
}


