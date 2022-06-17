#include<stdio.h>
struct length
{
    int feet;
    int inches;
};

int main()
{
    int num,i,j,k;
    printf("Enter the length: ");
    scanf("%d",&num);
    struct length a[4];
    int b[num];
    printf("Enter the values: ");
    for(i=0;i<num;i++)
    {
        scanf("%d",a[i].feet);
    }
    for(i=0;i<num;i++)
    {
        scanf("%d",a[i].inches);
    }
    for(i=0;i<num;i++)
    {
        b[i]=(12*a[i].feet)+a[i].inches;
    }
    int max= b[0];
    for(i=0;i<num;i++)
    {
        if(max>b[i])
        {
            max=b[i];
        }
    }
    printf("maximum length is %d",max);
    return 0;
}
