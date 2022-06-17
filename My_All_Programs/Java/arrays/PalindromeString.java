package arrays;
import java.util.Scanner;
public class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int i,len,flag=0;
		String str;
		System.out.print("Enter the string: ");
		str=sc.nextLine();
		len=str.length();
		for(i=0;i<len;i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
		sc.close();
	}

}
