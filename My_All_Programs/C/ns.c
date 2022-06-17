#include<stdio.h>
int main()
{
    int num,i,j,sum=0;
    printf("Enter the number: ");
    scanf("%d",&num);
    int arr[num];
    for(i=0;i<num;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<num;i++)
    {
        sum+=arr[i];
    }
    printf("The sum is %d",sum);
    return 0;
}
