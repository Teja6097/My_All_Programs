import java.util.*;
class rect
{
	int l,b;
	public void setDim(int l,int b)
	{
		int lenght=l,breadth=b;
	}
	public int area(int l,int b)
	{
		int res;
		res= l*b;
		return res;
	}
}
public class RectangleArea 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		rect myobj = new rect();
		myobj.l=sc.nextInt();
		myobj.b=sc.nextInt();
		int res=myobj.area(myobj.l,myobj.b);
		System.out.print(res);

	}

}
