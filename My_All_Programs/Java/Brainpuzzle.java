import java.util.*;
//import java.lang.*;
public class Brainpuzzle 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n,m,i,num1,count=0;
		System.out.print("enter the number1: ");
		n=sc.nextInt();
		System.out.print("enter the number2: ");
		m=sc.nextInt();
		num1=Reverse(n);
		int len1=Length(n),j;
		int arr[] = new int[len1];
		if(num1==1)
		{
			System.out.print("1");
		}
		else 
		{
			for(i=len1-1;i>=0;i--)
			{
				arr[i]=(n%10)*5;
				n/=10;
			}
			for(i=0;i<len1;i++)
			{
				int sum=0;
				for( j = 2;j<arr[i];j++)
				{
					int a;
					
					a=Isprime(j);
					if(a==1 && (j*2)+1<arr[i])
					{
						sum=sum+(j*2)+1;
					}
					
				}
				arr[i]=sum;
			}
			System.out.println();
			for(i=0;i<len1-1;i++)
			{
				for(j=i+1;j<len1;j++)
				{
					if((arr[i]+arr[j])%m==0)
					{
						count++;
					}
				}
			}
			System.out.print(count);
				
		}
	}
	public static int Length(int n)
	{
		int len=0;
		while(n!=0)
		{
			len++;
			n=n/10;
		}
		return len;
	}
	public static int Reverse(int n)
	{
		int temp=n,rem,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==n)
		{
			return 1;
		}
		else 
		{
			return 0;
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
