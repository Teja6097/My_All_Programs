#include<stdio.h>
int main()
{
    int len1,len2,i,j,k,temp,len;
    scanf("%d%d",&len1,&len2);
    int arr1[len1],arr2[len2],arr3[len1+len2];
    for(i=0;i<len1;i++)
    {
        scanf("%d",&arr1[i]);
    }
    for(i=0;i<len2;i++)
    {
        scanf("%d",&arr2[i]);
    }
    for(i=0;i<len1;i++)
    {
        arr3[i]=arr1[i];
    }
    j=0;
    for(i=len1;i<len1+len2;i++)
    {
        arr3[i]=arr2[j];
        j++;
    }
    len=len1+len2;
    for(i=0;i<len;i++)
    {
        for(j=i+1;j<len;j++)
        {
            if(arr3[i]>arr3[j])
            {
                temp=arr3[i];
                arr3[i]=arr3[j];
                arr3[j]=temp;
            }
        }
    }
    for(i=0;i<len;i++)
    {
        printf("%d ",arr3[i]);
    }

    return 0;
}
