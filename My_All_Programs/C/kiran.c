#include<stdio.h>

int main()
{
    long long int num,temp;
    int odd=0,even=0,i,count=0,rem;
    scanf("%lld",&num);
    temp=num;
    while(temp!=0)
    {
        count++;
        temp/=10;
    }
    temp=num;
    if(num>=0 && count<16)
    {
        while(temp!=0)
        {
            rem=temp%10;
            if(rem%2==0 && rem!=0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            temp=temp/10;
        }
        printf("%d\n%d",odd,even);
    }
    else
    {
        printf("Invalid");
    }

    return 0;
}
