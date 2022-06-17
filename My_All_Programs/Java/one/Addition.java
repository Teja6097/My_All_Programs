package one;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Ip = new Scanner(System.in);
		int num1, num2, result;
		System.out.println("Enter the number1: ");
		num1 = Ip.nextInt();
		System.out.println("Enter the number2: ");
		num2 = Ip.nextInt();
		result = num1 + num2;
		System.out.println("Addition of two numbers is: " + result);

	}

}
