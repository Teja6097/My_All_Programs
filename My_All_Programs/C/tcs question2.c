#include<stdio.h>
int main()
{
    int len,i,j,k;
    scanf("%d",&len);
    int arr[len];
    for(i=0;i<len;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<len;i++)
    {
        if(arr[i]==1)
        {

            printf("%d ",arr[i]);
        }
    }
    for(i=0;i<len;i++)
    {
        if(arr[i]==0)
        {

            printf("%d ",arr[i]);
        }
    }
    for(i=0;i<len;i++)
    {
        if(arr[i]==2)
        {

            printf("%d ",arr[i]);
        }
    }

    return 0;
}
