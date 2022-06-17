import java.util.Scanner;
public class Main 
{
   public static void main(String args[])
   {
      int num1, num2,j=0,i;
      Scanner sc = new Scanner(System.in);
      
      num1 = sc.nextInt();
      int arr[]= new int[1000];
      num2 = sc.nextInt();
      int flag=0;
      for (i = num1; i<num2; i++)
      {
         int check, rem, sum = 0;
         check = i;
         while(check != 0) 
         {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
         }
         if(sum == i)
         {
            arr[j++]=i;
            flag=1;
         }
      }
      
      if(flag==0)
      {
    	  System.out.print("Armstrong number not Found between the Given Interval");
      }
      else
      {
    	  System.out.println("Armstrong numbers Between the Given Interval");
    	  for(i=0;i<j;i++)
    	  {
    		  System.out.print(arr[i]+" ");
    	  }
      }
   }
}