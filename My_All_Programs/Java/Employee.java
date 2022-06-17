import java.util.*;
public class Employee 
{
	String name;
	int age;
	String designation;
	double salary;
	public Employee(String name)
	{
		System.out.println("the name of employee is: "+ name);
	}
	public void setage(int agenumber)
	{
		age=agenumber;
	}
	public int getage()
	{
		System.out.println("The age of employee is: "+age);
		return age;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee("Sangala");
		int a;
		System.out.print("Enter the age: ");
		a=sc.nextInt();
		emp.setage(a);
		emp.getage();
		

	}

}
