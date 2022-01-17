import java.util.*;
public class TreeMahasiswa_Nden {
    public static void main(String[] args) {
        Tree_Nden myTree = new Tree_Nden(); 
        Scanner keyboard = new Scanner(System.in);
        int input;
        while(true){
            System.out.println("\nPILIHAN :");
            System.out.println("\t1 - Input Nama Mahasiswa");
            System.out.println("\t2 - Cari Nama Mahasiswa");
            System.out.println("\t3 - Tampilkan Nama Mahasiswa");
            System.out.println("\t4 - Keluar");
            input = keyboard.nextInt();
            Scanner scanner = new Scanner(System.in);
            if(input == 1){
            System.out.println("Masukan Nama Mahasiswa: ");
            String word = scanner.next().toUpperCase();
            myTree.insert(word);
            System.out.println("Inserted " + "'" + word + "'" + " into tree");
            }else if(input == 2){
            System.out.println("Cari Nama Mahasiswa: ");  
            }else if(input == 3){
            System.out.println("Tampilkan: ");
            myTree.preOrder();
            }else if(input == 4){
                System.exit(0);
            }
            System.out.println("\nMasukan Pilihan Lain");
            }           
       }
    }