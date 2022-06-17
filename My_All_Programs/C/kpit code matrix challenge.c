#include<stdio.h>
int main()
{
    int m,n,p,q,i,j,k,l,r1,c1;
    pritnf("Enter the m value: ");
    scanf("%d",&m);
    pritnf("Enter the n value: ");
    scanf("%d",&n);
    pritnf("Enter the p value: ");
    scanf("%d",&p);
    pritnf("Enter the q value: ");
    scanf("%d",&q);
    int mat1[m][n],mat2[p][q],mat3[m][n];
    printf("Enter the matrix 1 values: ");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&mat1[i][j]);
        }
    }
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&mat2[i][j]);
        }
    }
    for(i=0;i<m;i++)
    {

        for(j=0;j<n;j++)
        {
            r1=i;
            c1=j;
            if(r1<m&&c1<n)
            {
                if(r1==0&&c1==0)
                {
                    mat3[0][0]=mat1[0][0]*mat2[0][0];
                }
                else if(r1==1&&c1==1)
                {
                    mat3[1][1]=mat1[1][1]*mat1[1][1]
                }
                else
                {

                }
            }
        }
    }


    return 0;
}
