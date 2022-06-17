#include<stdio.h>
int main()
{
    int i,n,j,k,diff,count=0;
    scanf("%d",&n);
    int mat[n][2];
    int x1,y1;
    scanf("%d%d",&x1,&y1);
    for(i=0;i<n;i++)
    {
        for(j=0;j<2;j++)
        {
            scanf("%d",&mat[i][j]);
        }
    }
    diff=x1-y1;

    for(i=0;i<n;i++)
    {
        if((mat[i][0]-mat[i][1])==diff)
        {

            count++;
            printf("%d %d\n",mat[i][0],mat[i][1]);
        }
    }
    printf("%d",count);


    return 0;
}
