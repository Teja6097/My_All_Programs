package arrays;
import java.util.*;
public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int len,i,min=0,sum1=0,sum2=0;
		len=sc.nextInt();
		int arr[]=new int[len];
		for(i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k;
		k=sc.nextInt();
		for(i=0;i<len-1;i++)
		{
			
			sum1+=arr[i]+arr[i+1];
			
			
		}
		int mul1=sum1*k,mul2;
		for(i=len-2;i>=0;i--)
		{
			sum2+=arr[i]+arr[i+1];
		}
		mul2=sum2*k;
		
		System.out.print(min);

	}

}
