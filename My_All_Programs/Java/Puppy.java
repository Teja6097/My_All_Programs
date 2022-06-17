
public class Puppy 
{
	int puppyage;
	String sex;
	public Puppy(String name)
	{
		System.out.println("Puppy named as "+name);
	}
	public void setage(int age)
	{
	 puppyage=age;
	}
	public int getAge()
	{
		System.out.println("Puppy age is: "+puppyage);
		return puppyage;
	}
	public void puppysetsex(String sextype)
	{
		sex=sextype;
	}
	public String getsex()
	{
		System.out.println("The sex of puppy is: "+sex);
		return sex;
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Puppy a = new Puppy("tommy");
		a.setage(4);
		a.getAge();
		a.puppysetsex("male");
		a.getsex();
		

	}

}
