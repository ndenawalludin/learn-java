import java.util.Scanner;

public class Soal_303 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int X, Y, Kuadran = 0;
        System.out.println("MENCARI LETAK KUADRAN DARI TITIK P(X,Y)");
        System.out.print("Mencari Titik X : ");
        X = input.nextInt();
        System.out.print("Mencari Titik Y : ");
        Y = input.nextInt();
        System.out.println("Letak P(X) : "+X);
        System.out.println("Letak P(Y) : "+Y);
        if (X>0&&Y>0){
        Kuadran = (int) (1);}
        else if (X<0&&Y>0){
        Kuadran = (int) (2);}
        else if (X<0&&Y<0){
        Kuadran = (int) (3);}
        else if (X>0&&Y<0){
        Kuadran = (int) (4);}
        System.out.println();         
        System.out.println("Letak Titik P nya adalah = "+Kuadran);
        System.out.println();
        System.out.println("*** Tian Chan ***");
    }
}