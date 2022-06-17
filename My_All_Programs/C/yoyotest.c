#include<stdio.h>

int main()
{
    int num,size,i,j,k,l;
    printf("Enter the number: ");
    scanf("%d",&num);
    printf("Enter the size: ");
    scanf("%d",&size);
    int arr[size],brr[num];
    for(i=0; i<size; i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0; i<num; i++)
    {
        brr[i]=0;
    }
    for(i=0; i<size-1; i++)
    {
        if(arr[i]<arr[i+1])
        {
            for(k=arr[i]; k<=arr[i+1]; k++)
            {
                brr[k-1]=brr[k-1]+1;
            }
        }
        else
        {
            for(k=arr[i+1]; k<=arr[i]; k--)
            {
                brr[k-1]=brr[k-1]+1;
            }
        }


    }
    printf("Result: \n");
    for(i=0;i<num;i++)
    {

        printf("%d ",brr[i]);
    }

    return 0;
}
