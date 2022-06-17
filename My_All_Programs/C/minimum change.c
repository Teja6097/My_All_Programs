#include<stdio.h>
int main()
{
    int num,dif,min1,min2,min3,rem1,rem2,change;
    printf("Enter the the money given: ");
    scanf("%d",&num);
    if(num>=0&&num<=400)
    {
        rem1=(num%200);
        if(rem1==0)
        {
            min1=0;
        }
        else
        {
            min1=200-rem1;
        }

        //min1=200-rem1;
    }
    else
    {
        rem2=(num%100);
        if(rem2==0)
        {
            min1=0;
        }
        else
        {
            min1=100-rem2;
        }

    }
    printf("The change given wil be: %d",min1);
    return 0;
}
