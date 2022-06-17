#include<stdio.h>

int main()
{
    int n,i,count=0;
    scanf("%d",&n);
    while(n!=1)
    {
        if(n%3==0)
        {
            n/=3;
            count++;
        }
        else
        {
            n-=1;
            count++;
        }
    }
    printf("%d",count);
    return 0;
}
