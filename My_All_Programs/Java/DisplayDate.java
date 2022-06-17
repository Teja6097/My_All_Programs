import java.util.*;
import java.text.*;
public class DisplayDate 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("the date is: "+date);
		Date a = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' HH.mm.ss zzz");
		System.out.print("Current date : " + sdf.format(a));
	}

}
