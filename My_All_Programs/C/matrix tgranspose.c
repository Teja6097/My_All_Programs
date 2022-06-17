#include<stdio.h>
int main()
{
    int i,j,k,n,m;
    printf("Enter the  rows,and columns: ");
    scanf("%d%d",&n,&m);
    int arr[n][m],brr[m][n];
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {

            brr[j][i]=arr[i][j];
        }
    }
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {

            printf("%d ",brr[i][j]);
        }
        printf("\n");
    }

    return 0;
}
