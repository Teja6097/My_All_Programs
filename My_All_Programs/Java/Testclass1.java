import java.util.Scanner;


class Student
{
	int id;
	String name;
}
public class Testclass1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		//Student s3 = new Student();
		System.out.print("Enter the stud1 id number: ");
		s1.id=sc.nextInt();
		System.out.print("Enter the stud1 name: ");
		s1.name=sc.next();
		System.out.print("Enter the stud2 id number: ");
		s2.id = sc.nextInt();
		System.out.print("Enter the stud2 name: ");
		s2.name=sc.nextLine();
		System.out.println("stud1 id number: "+ s1.id);
		System.out.println("stud1 name: "+s1.name);
		System.out.println("stud2 id number: "+s2.id);
		System.out.println("stud2 name: "+s2.name);
	}

}
