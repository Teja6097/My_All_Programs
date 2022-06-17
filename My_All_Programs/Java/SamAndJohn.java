import java.util.*;
class Details
{
	int roll_number,phone_number;
	String address,name;
}
public class SamAndJohn 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Details myobj1= new Details();
		Details myobj2= new Details();
		
		System.out.print("Enter the name of person1: ");
		myobj1.name=sc.nextLine();
		
		System.out.print("Enter the roll number of person1: ");
		myobj1.roll_number=sc.nextInt();
		
		System.out.print("Enter the phone number of person1: ");
		myobj1.phone_number=sc.nextInt();
		
		System.out.print("Enter the address of person1: ");
		myobj1.address=sc.next();
		
		System.out.print("Enter the name of person2: ");
		myobj2.name=sc.nextLine();
		
		System.out.print("Enter the roll number of person2: ");
		myobj2.roll_number=sc.nextInt();
		
		System.out.print("Enter the phone number of person2: ");
		myobj2.phone_number=sc.nextInt();
		
		System.out.print("Enter the address of person2: ");
		myobj2.address=sc.nextLine();
		
		System.out.println("name: "+myobj1.name+" roll number: "+myobj1.roll_number+" phone number: "+myobj1.phone_number+" address: "+myobj1.address);
		System.out.println("name: "+myobj2.name+" roll number: "+myobj2.roll_number+" phone number: "+myobj2.phone_number+" address: "+myobj2.address);

	}

}
