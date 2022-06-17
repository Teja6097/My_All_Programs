package arrays;
import java.util.Scanner;
public class calculator 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		char enter;
		System.out.print("Enter the number1: ");
		num1=sc.nextInt();
		System.out.print("Enter the chartecter: ");
		enter=sc.next().charAt(0);
		System.out.print("Enter the number2: ");
		num2=sc.nextInt();
		switch(enter)
		{
			case '+' : System.out.print(num1+num2); break;
			case '-' : System.out.print(num1-num2); break;
			case '*' : System.out.print(num1*num2); break;
			case '/' : System.out.print(num1/num2); break;
			case '%' : System.out.print(num1%num2); break;
			default : System.out.print("check correctly");
		}
	}

}
