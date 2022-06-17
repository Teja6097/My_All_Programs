import java.text.*;
import java.util.*;
public class Dateanddays 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String date1;
		System.out.print("Enter the date: ");
		date1 = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int n;
		System.out.print("Enter the number of days: ");
		n=sc.nextInt();
		Calendar c = Calendar.getInstance();
		try
		{
			c.setTime(sdf.parse(date1));
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		c.add(Calendar.DAY_OF_MONTH, n);
		String newdate1 = sdf.format(c.getTime());
		System.out.print("New date is: "+newdate1);
	}

}
