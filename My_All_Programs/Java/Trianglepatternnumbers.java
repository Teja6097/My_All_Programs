import java.util.*;
public class Trianglepatternnumbers 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,i,j,k,l,m;
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		for(i=num;i>0;i--)
		{
			k=1;
			for(j=i;j>0;j--)
			{
				System.out.print(k++);
			}
			m=k-2;
			for(l=i-1;l>0;l--)
			{
				System.out.print(m--);
			}
			System.out.println();
		}

	}

}
