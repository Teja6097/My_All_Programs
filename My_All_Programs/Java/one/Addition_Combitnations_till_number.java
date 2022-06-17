package one;

import java.util.Scanner;

public class Addition_Combitnations_till_number {
	public static void main(String[] args) {
		Scanner Ip = new Scanner(System.in);
		int num, i, j, k, l, m;
		System.out.print("Enter a number: ");
		num = Ip.nextInt();
		System.out.println(num);
		for (i = 1; i <= num / 2; i++) {
			for (j = 1; j <= num; j++) {
				if (i * j == num) {
					for (k = 0; k < j; k++) {
						System.out.print(i);
					}
					System.out.println();
				}
				for (l = 1; l < num; l++) {
					if ((i * j) + l == num && l != 1) {
						for (m = 0; m < j; m++) {
							System.out.print(i);
						}
						System.out.println(l);
					}
				}

			}
		}
	}

}