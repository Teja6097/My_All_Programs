#include<stdio.h>
int prime(int num)
{
    int i,j,flag=0;
    for(i=2;i<num/2;i++)
    {
        if(num%i==0)
        {
            flag=1;
            break;
        }
    }
    if(flag==1 && num !=2 && num!=1)
    {
        return 0;
    }
    else
    {
        return 1;
    }
}
int main()
{
    int start,end,i,j,k,l,minimum,maximum,flag=0,flag1=0,count=0;
    scanf("%d",&start);
    scanf("%d",&end);
    for(i=start;i<=end;i++)
    {
        if(prime(i)==1)
        {
            minimum=i;
            break;
        }
    }

    for(i=end;i>=start;i--)
    {
        if(prime(i)==1)
        {
            maximum=i;
            break;
        }
    }
    N

    printf("%d\n",count);
    printf("%d",maximum-minimum);
    return 0;
}
