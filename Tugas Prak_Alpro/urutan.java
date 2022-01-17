import java.util.Scanner;
public class urutan{
	public static void main (String[] args){
		int a,b,c;
		System.out.println("Program menentukan bilangan terbesar");
		System.out.println("------------------------------------");
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("Masukan bilangan pertama : ");
		a = num.nextInt();
		
		System.out.print("Masukan bilangan Kedua : ");
		b = num.nextInt();
		
		System.out.print("Masukan bilangan Ketiga : ");
		c = num.nextInt();
		
		
		if(a>b){
			if (a>c){
				System.out.println("bilangan terbesar = " +a);
			}
			else {
				System.out.println("bilangan terbesar = " +c);
			}	
		}
		
		else if(a<b){
			if(b>c){
				System.out.println("bilangan terbesar = " +b);
			}
			else{
				System.out.println("bilangan terbesar = " +c);
			}
		}
	}

}