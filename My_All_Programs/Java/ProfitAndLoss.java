import java.util.Scanner;
public class ProfitAndLoss 
{

	public static void main(String[] args) 
	{
		double x,y,z,CostOfOneToy,Profit,ProfitPercentage;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of dozens of toys purchased: ");
		x=sc.nextDouble();
		System.out.print("Enter the price per dozen: ");
		y=sc.nextDouble();
		System.out.print("Enter the selling price of one toy: ");
		z=sc.nextDouble();
		CostOfOneToy=y/12;
		Profit=z-CostOfOneToy;
		ProfitPercentage=(Profit*100)/CostOfOneToy;
		System.out.print("Sam's Profit Percentage is: "+ProfitPercentage);
	}

}
