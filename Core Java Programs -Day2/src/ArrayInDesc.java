
import java.util.Scanner;
public class ArrayInDesc {
	public static void main(String[] args)
	{
		int arr[]=new int[]{7,2,6,8};
		int temp=0;
		System.out.println("Elements before sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		//sort the array in descending order
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Elements of array sorted in descending");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		
	}
}