#include<stdio.h>
int main()
{
    int t,i,j,k,sum,n,count,ind;
    scanf("%d",&t);
    while(t--)
    {
        count=0;
        sum=0;
        scanf("%d",&n);
        for(i=1;i<n;i++)
        {
            sum=sum+i;
            count++;
            if(sum>n/2)
            {
                ind=i;
                break;
            }
        }
        for(j=ind;j>1;j--)
        {
            count++;
        }
        if(t>1)
        {
            printf("%d\n",count);
        }
        else
        {
            printf("%d",count);
        }

    }
    return 0;
}
