import java.util.*;

public class Factcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, i, j, count = 0, count1;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		for (i = n1; i <= n2; i++) {

//			for(j=1;j<=i;j++)
//			{
//				if(i%j==0)
//				{
//					count1++;
//				}
//			}
			count1 = countfact(i);
			if (count1 == 4) {
				count++;
			}
		}
		System.out.print(count);

	}

	public static int countfact(int n) {
		int count = 0, i;
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		return count;
	}
}