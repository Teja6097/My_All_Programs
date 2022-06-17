package arrays;
import  java.util.Scanner;
public class Fibbanocci 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int first=0,second=1,num,i,j,temp;
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		for(i=0;i<num;i++)
		{
			System.out.print(first+" ");
			temp=first +second;
			first=second;
			second=temp;
		}
		
	}

}
