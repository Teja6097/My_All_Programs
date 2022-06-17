#include<stdio.h>


int main()
{
    int testCases,len,i,j,k,temp,count=0;
    scanf("%d",&testCases);
    while(testCases--)
    {
        scanf("%d",&len);
        int arr[len],brr[len];
        for(i=0;i<len;i++)
        {
            scanf("%d",&arr[i]);
        }
         for(i=0;i<len;i++)
        {
            scanf("%d",&brr[i]);
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
            for(j=i+1;j<len;j++)
            {
                if(brr[i]>brr[j])
                {
                    temp=brr[i];
                    brr[i]=brr[j];
                    brr[j]=temp;
                }
            }
        }
        for(i=0;i<len;i++)
        {
            if(brr[i]>arr[i])
            {
                count++;
            }
        }
        if(count==len)
        {
            printf("WIN");
        }
        else
        {
            printf("LOSE");
        }
    }


    return 0;
}
