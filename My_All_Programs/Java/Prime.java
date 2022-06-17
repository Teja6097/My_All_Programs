import java.util.*;
public class Prime 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,i,flag=0;
		System.out.print("Enter the nuimber: ");
		num=sc.nextInt();
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1 && num!=2 || num==1)
		{
			System.out.print("is not a prime");
		}
		else
		{
			System.out.print("is  a prime");
		}
	}

}
