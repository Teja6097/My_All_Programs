#include<stdio.h>
int main()
{
    int len,i,j,k,temp,good=0,bad=0;
    scanf("%d",&len);
    int arr[len],brr[len];
    for(i=0;i<len;i++)
    {
        scanf("%d",&arr[i]);
        brr[i]=arr[i];
    }
    for(i=0;i<len;i++)
    {
        for(j=i+1;j<len;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
    }
    for(i=0;i<len;i++)
    {
        if(arr[i]==brr[i])
        {
            good+=arr[i];
        }
        else
        {
            bad+=arr[i];
        }
    }
    printf("%d",good-bad);
    return 0;
}
