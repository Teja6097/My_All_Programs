#include<stdio.h>

int main()
{
    int num,i,j,k,l,a,count=0;
    printf("Enter The number: ");
    num=5;
    //scanf("%d",&num);
    printf("%d\n",num);

    for(i=1;i<=num/2;i++)
    {
        count=0;
        for(j=1;j<=num;j++)
        {
            if(i*j==num )
            {
                for(k=1;k<=j;k++)
                {
                    printf("%d ",i);
                }
                printf("\n");
            }
            for(l=1;l<num;l++)
            {

                if(((i*j)+l)==num &&l!=i )
                {
                    for(a=1;a<=j;a++)
                    {
                        printf("%d ",i);
                    }
                    printf("%d\n",l);
                }

            }

        }

    }

    return 0;
}
