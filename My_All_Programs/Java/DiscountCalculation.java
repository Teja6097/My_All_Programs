import java.util.*;
import java.text.*;
public class DiscountCalculation 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		float item1,item2,DiscountAmount,TotalAmount,AmountDiscounted;
		int discount;
		System.out.print("Enter the price of item1: ");
		item1=sc.nextFloat();
		System.out.print("Enter the price of item2: ");
		item2=sc.nextFloat();
		System.out.print("Enter the percentage of discount: ");
		discount=sc.nextInt();
		TotalAmount=item1+item2;
		System.out.println("Total amount of item1 and item2 is: "+ TotalAmount);
		AmountDiscounted=(TotalAmount*discount)/100;
		DiscountAmount=TotalAmount-AmountDiscounted;
		System.out.println("Discount Selling Price: "+df.format(DiscountAmount));
		System.out.println("Saved amount: "+ df.format(AmountDiscounted));
	}

}
