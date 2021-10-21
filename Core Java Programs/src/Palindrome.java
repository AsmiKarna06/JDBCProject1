import java.util.Scanner;
public class Palindrome 
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Text");
		String name=scan.nextLine();
		System.out.println(name.charAt(2));
		System.out.println(name.length());
		System.out.println(name.indexOf('x'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String res="";
		
		String s= "abc";
		String s3="abc";
		String s1=new String("abc");
		String s2=new String("abc");
		
		if(s==s3)
			System.out.println("same object");
		else
			System.out.println("different object");
		
		for(int i=name.length()-1;i>=0;i--)
		{
			res=res+name.charAt(i);	
		}
		System.out.println("Reverse:"+res);
		if(name.equals(res))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}