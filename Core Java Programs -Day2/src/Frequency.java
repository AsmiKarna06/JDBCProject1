public class Frequency {
	public static void main(String []args)
	{
		int arr[]=new int[]{2,7,5,1,8,2,7,7};
		int freq[]=new int[arr.length];
		int v=-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=v;
				}
			}
			if(freq[i]!=v)
				freq[i]=count;
		}
		System.out.println("");
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=v)
				System.out.println(" "+arr[i]+" |" +freq[i]);
		}
		System.out.println(" ");
	}
}


