import java.util.*;
class Length
{
	int feet;
	int inches;
}
public class Maxlength 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,i,max=0,temp;
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		Length l1= new Length();
		System.out.println("Enter the values: ");
		for(i=0;i<num;i++)
		{
			l1.feet=sc.nextInt();
			l1.inches=sc.nextInt();
			temp=(l1.feet*12)+l1.inches;
			if(temp>max)
			{
				max=temp;
			}
			
		}
		System.out.print("The maximum length is: "+max);

	}

}
