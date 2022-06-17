#include<stdio.h>
int main()
{
    int star=0,num,i,j,k,count=1;
    printf("Enter a number; ");
    scanf("%d",&num);
    char c='A';
    for(i=0;i<num;i++)
    {
        printf("%c",c++);
        if(i>1)
        {
            for(j=i;j>1;j--)
            {
                printf("*");
            }
        }
        if(i>0)
        {
            printf("%d",count++);
        }
        printf("\n");
    }

    return 0;
}
