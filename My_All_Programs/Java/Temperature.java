import java.util.*;
public class Temperature 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j,count=0;
		n= sc.nextInt();
		while(n!=1)
		{
			if(n%7==0)
			{
				n/=7;
				count++;
			}
			else if(n%3==0)
			{
				n/=3;
				count++;
			}
			else
			{
				n--;
				count++;
			}
		}
		System.out.print(count);

	}

}
