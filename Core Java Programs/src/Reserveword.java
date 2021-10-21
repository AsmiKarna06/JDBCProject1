import java.util.*;
public class Reserveword {
	public void reverseword(String str1)
	{
		String[] words=str1.split(" ");
		String revString = "";
		for (int i=0; i<words.length;i++)
		{
			String w=words[i];
			String reverseWord = "";
			for(int j=w.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord+w.charAt(j);
			}
			revString=revString+reverseWord+" ";
		}
		System.out.println(revString);
	}
	public static void main(String[] args)
	{
		Reserveword obj=new Reserveword();
		String StrGiven="How are you";
		System.out.println("String" + StrGiven);
		System.out.println("The reversed String is:");
		obj.reverseword(StrGiven);
	}
}