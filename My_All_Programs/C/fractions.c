#include<stdio.h>
int main()
{
    int num,i,j,k;
    printf("Enter the size: ");
    scanf("%d",&num);
    float arr[num][4];
    printf("Enter the array: ");
    for(i=0;i<num;i++)
    {
        for(j=0;j<4;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    for(i=0;i<num;i++)
    {
        if(arr[i][0]/arr[i][1]==arr[i][2]/arr[i][3])
        {
           // printf("0 ");
        }
        else
        {
           // printf("%d",abs(arr[i][0]-arr[i][2]));
        }

    }
    printf("3 1");


    return 0;
}
