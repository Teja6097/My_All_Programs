import java.util.*;
import java.io.*;
public class Permutations 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		StringBuffer sb = new StringBuffer();
		System.out.print("Enter the string : ");
		str = sc.next();
		int len,i,j=0,k;
		len=str.length();
		String str1="";
		for(i=0;i<len;i++)
		{
			if((str.charAt(i)>='a'&&str.charAt(i)<='z') || (str.charAt(i)>='a'&&str.charAt(i)<='z'))
			{
				str1+=str.charAt(i);
				j++;
			}
		}
		System.out.println(str1);
		String str2;
		sb.append(str1);
		sb.reverse();
		System.out.print(sb);
		
	}

}
