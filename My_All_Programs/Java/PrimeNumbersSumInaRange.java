import java.util.*;
public class PrimeNumbersSumInaRange 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int start,end,i,sum=0;
		System.out.print("Enter the starting number: ");
		start =sc.nextInt();
		System.out.print("Enter the ending number: ");
		end=sc.nextInt();
		for(i=start;i<=end;i++)
		{
			if(Isprime(i)==1)
			{
				sum+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("The total sum of prime numbers in range between "+ start+" and "+end+" is "+sum);
//
	}
	public static int Isprime(int n)
	{
		int i,flag=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1&&n!=2||n==1 )
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

}
