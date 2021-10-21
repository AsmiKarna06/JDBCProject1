import java.util.Scanner;
public class nameinAsce {
	public static void main(String args[])
	{
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of n");
		int n=sc.nextInt();
		sc.nextLine();
		String names[]=new String[n];
		System.out.println("Enter name");
		for(int i=0;i<n;i++)
		{
			System.out.println(i+1);
			names[i]=sc.nextLine();
		}
		for(int i=0; i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				if(names[j-1].compareTo(names[j])>0)
				{
					temp=names[j-1];
					names[j-1]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("Sorted names in ascending order");
		for(int i=0;i<n;i++)
		{
			System.out.println(names[i]);
		}
	}
}