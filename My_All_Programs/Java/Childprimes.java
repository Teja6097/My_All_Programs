import java.util.*;
public class Childprimes 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n,i;
		n= sc.nextInt();
		for(i=2;i<n;i++)
		{
			int a=Isprime(i);
			if(a==1 &&((i*2)+1<n))
			{
				System.out.print(((i*2)+1)+" ");
				
			}
		}

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
		if(flag==1 && n!=2)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
