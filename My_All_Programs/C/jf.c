#include<stdio.h>
void * array1(int n)
{
    int local[n],i;
    for(i=0;i<n;i++)
    {
        local[i]=0;
    }
    for(i=0;i<n;i++)
    {
        printf("%d ",local[i]);
    }
}
int main()
{
    int n,i;
    scanf("%d",&n);

    int arr[n];
    int *array1(n);

    return 0;

}
