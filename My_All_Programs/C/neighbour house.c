#include<stdio.h>
int main()
{
    int len,num,k,i,j,diff,temp,index,m1,m2;
    printf("Enter number of houses: ");
    scanf("%d",&num);
    int arr[num];
    printf("enter the house numbers: ");
    for(i=0;i<num;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the house number: ");
    scanf("%d",&k);
    for(i=0;i<num-1;i++)
    {
        for(j=i;j<num;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    if(arr[0]==k)
    {
        printf("%d",arr[1]);
    }
    else if(arr[num-1]==k)
    {
        printf("%d",arr[num-2]);
    }
    else
    {
        for(i=1;i<num-1;i++)
        {
            if(arr[i]==k)
            {
                index=i;
            }
        }
        m1=arr[index+1]-arr[index];
        m2=arr[index-1]-arr[index];
        if(m1==m2)
        {
            printf("%d",arr[index-1]);
        }
        else if(m1>m2)
        {
            printf("%d",arr[index+1]);
        }
        else
        {
            printf("%d",arr[index-1]);
        }
    }
    return 0;
}
