package arrays;
import java.util.Scanner;
public class freequency 
{

	public static void main(String[] args)
	{
		int len,i,j,k,l,count=0;
		System.out.print("Enter the length of the array: ");
		Scanner sc = new Scanner(System.in);
		len = sc.nextInt();
		int arr[]= new int[len];
		System.out.print("Enter  the array: ");
		for(i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Output: ");
		for(i=0;i<len;i++)
		{
			count=0;
			if(i==0)
			{
				for(j=0;j<len;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
					}
				}
				System.out.println(arr[i]+" " + count);
			}
			else
			{
				for(j=i-1;j>=0;j--)
				{
					if(arr[i]==arr[j]) 
					{
						continue;
					}
					else
					{
						for(k=i;k<len;k++)
						{
							if(arr[i]==arr[k])
							{
								count++;
							}
						}
						System.out.println(arr[i]+" " + count);
					}
				}
			}
		}
	}

}
