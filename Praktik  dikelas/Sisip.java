import java.util.Scanner;
class Sisip
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int x;
		int maxSize=100;//array size
		ArrayBub arr;//reference to array
		arr = new ArrayBub(maxSize);///create the array
		arr.insert(8);//insert angka
		arr.insert(16);
		arr.insert(18);
		arr.insert(12);
		
		System.out.println("Before");
		arr.display();//display items
		arr.BubbleSort();//bubble sort them
		
		System.out.print("Masukkan nilai yang akan disisipkan : ");
		x = input.nextInt();
		arr.insert(x);
		
		System.out.println("After");
		arr.BubbleSort();//bubble sort them
		arr.display();//display items
		
	}
}