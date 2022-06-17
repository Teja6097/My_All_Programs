#include<stdio.h>
int main()
{
    int len,i,j,temp;
    scanf("%d",&len);
    int arr[len];
    for(i=0;i<len;i++)
    {
        scanf("%d",&arr[i]);

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
    printf("%d",arr[0]);
    return 0;
}

