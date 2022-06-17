#include<stdio.h>
int main()
{
    int len,sum,sum1,i,j,k,l;

    scanf("%d",&len);
    int arr[len];

    for(i=0;i<len;i++)
    {
        scanf("%d",&arr[i]);
    }

    scanf("%d",&sum);
    for(i=0;i<len-1;i++)
    {
        for(j=i;j<len;j++)
        {
            if(arr[i]+arr[j]==sum)
            {
                printf("%d %d\n",arr[i],arr[j]);
            }
        }
    }



    return 0;
}
