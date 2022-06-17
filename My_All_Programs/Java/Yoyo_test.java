import java.util.*;
public class Yoyo_test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num,i,j=0,k;
		num=sc.nextInt();
		int size;
		size= sc.nextInt();
		int arr[]= new int[size];
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int brr[]=new int[num];
		for(i=0;i<num;i++)
		{
			brr[i]=0;
		}
		for(i=0;i<size-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				for(k=arr[i];k<=arr[i+1];k++)
				{
					brr[k-1]++;
				}
			}
			else 
			{
				for(k=arr[i+1];k<=arr[i];k--)
				{
					brr[k-1]++;
				}
			}
			
			
		}
	
	for(i=0;i<num;i++)
	{
		System.out.print(brr[i]+" ");
	}
	}

}
