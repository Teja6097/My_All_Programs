import java.util.*;
public class BInarSearch 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,index,key,n;
		System.out.print("Enter the lenght of array: ");
		n= sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array values: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Enter the key for searching: ");
		key = sc.nextInt();
		index=Arrays.binarySearch(arr,key);
		if(index<0)
		{
			System.out.print("Key not found");
		}
		else 
		{
			System.out.print("key found at "+index);
		}

	}

}
