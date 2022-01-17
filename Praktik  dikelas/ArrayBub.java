public class ArrayBub
{
	private static void ArrayBub(int newElem)
	{
		boolean cari;
		int N=6;
		int i,j;
		int A[]={2,4,5,6,8,10};
		
		System.out.println("Array sebelum di sisipkan");
		for(int m=0;m<=N;m++)
		{
			System.out.print("\t"+A[m]);
		}
		System.out.println();
		cari=false;
		i=0;
		while (i<N && !cari)
		{
			if (newElem<A[i])
			{
				cari=true;
			}
			else
			{
				i++;
			}
		}
			if(cari)
			{
				for(j=(N-1);j>=i;j--)
				{
					A[j+1]=A[j];
				}
				A[i]=newElem;
			}
			else
			{
				A[N]=newElem;
			}
		System.out.println("Array setelah di sisipkan");
		for(int m=0;m<=N;m++)
		{
			System.out.print("\t"+A[m]);
		}
		System.out.println();
	}
	
}