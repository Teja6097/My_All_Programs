import java.util.*;
public class SecureURL 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String InputUrl,StartUrl;
		System.out.print("Enter the url: ");
		InputUrl=sc.nextLine();
		System.out.print("Enter the url Starting: ");
		StartUrl=sc.nextLine();
		int InputUrlLength,StartUrlLength,flag=0;
		InputUrlLength=InputUrl.length();
		StartUrlLength=StartUrl.length();
		int i,j,k;
		for(i=0;i<StartUrlLength;i++)
		{
			if(StartUrl.charAt(i)!=InputUrl.charAt(i))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.print(InputUrl+" does not start with "+ StartUrl);
		}
		else
		{
			System.out.print(InputUrl+" start with "+ StartUrl);
		}
	}

}
