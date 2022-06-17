#include <stdio.h>
int main()
{
   int year;
   printf("Enter a year: ");
   scanf("%d", &year);
    int count=0, temp,flag=0;
    temp=year;
    //for(i=0)
    while(temp!=0)
    {
        count++;
        if(!(temp%10>=0 && temp%10<=9))
        {
            flag==1;
             break;
        }
        temp/=10;
    }
    if(count<=5 && flag==0)
    {
        if (year % 400 == 0)
        {
            printf("Leap Year");
        }
        else if (year % 100 == 0)
        {
            printf(" Not a Leap Year");
        }
        else if (year % 4 == 0)
        {
            printf("Leap Year", year);
        }
        else
        {
        printf("Not a Leap Year", year);
        }
    }
    if(count>5 && flag==0)
   {
       printf("Invalid size");
   }
    if(flag==1)
   {
       printf("Invalid  input");
   }



   return 0;
}
