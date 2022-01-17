import java.util.Scanner;
class sisip_sort
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int x;
		int maxSize=100;
		ArrayBub arr;
		arr = new ArrayBub(maxSize);
		arr.insert(8);
		arr.insert(16);
		arr.insert(18);
		arr.insert(12);
		
		System.out.println("Sebelumnya");
		arr.display();
		arr.BubbleSort();
		
		System.out.print("Masukkan nilai yang akan disisipkan : ");
		x = input.nextInt();
		arr.insert(x);
		
		System.out.println("After");
		arr.BubbleSort();
		arr.display();
		
	}
}