import java.util.*;
import java.io.*;
public class Replcacompany 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String str;
		
		System.out.print("Enter the String: ");
		str = sc.nextLine();
		String oldc,newc;
		System.out.print("Enter the old name: ");
		oldc=sc.nextLine();
		System.out.print("Enter the new name: ");
		newc=sc.nextLine();
		String out;
		out = str.replaceAll(oldc, newc);
		System.out.print(out);
	}

}
