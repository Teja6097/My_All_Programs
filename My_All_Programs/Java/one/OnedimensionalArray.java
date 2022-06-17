package one;
import java.util.Scanner;
public class OnedimensionalArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,len;
		System.out.print("Enter the length of the array: ");
		len= sc.nextInt();
		int arr[]=new int[len];
		int brr[]=new int[len];
		int crr[]=new int[len];
		System.out.print("Enter the array1: ");
		for(i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the array2: ");
		for(i=0;i<len;i++)
		{
			brr[i]=sc.nextInt();
		}
		System.out.println("adiition of two arrays: ");
		for(i=0;i<len;i++)
		{
			crr[i]=arr[i]+brr[i];
		}
		for(i=0;i<len;i++)
		{
			System.out.print(crr[i]+" ");
		}
	}

}
