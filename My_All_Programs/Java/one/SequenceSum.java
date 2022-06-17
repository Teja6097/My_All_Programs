package one;
import java.util.*;
public class SequenceSum 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int i,j,k,sum=0,a,b,c;
		System.out.print("Enter the i value: ");
		i=sc.nextInt();
		System.out.print("Enter the j value: ");
		j=sc.nextInt();
		System.out.print("Enter the k value: ");
		k=sc.nextInt();
		for(a=i;a<j;a++)
		{
			sum+=a;
		}
		for(a=j;a>=k;a--)
		{
			sum+=a;
		}
		System.out.print(sum);

	}

}
