#include<stdio.h>

int main()

{
    int n,i,temp,flag=0,ans;
    printf("Enter a number: ");
    scanf("%d",&n);
    temp=n;
    for(i=1;n!=1;i++)
    {
        if(n%2==0)
        {
            n=n/2;
        }
        else
        {
            n=(3*n)+1;
        }
        if(n==1)
        {
            flag==1;
            break;
        }
    }
    if(flag==1)
    {
        printf("Yes");
    }
    else
    {
        printf("No");
    }
    return 0;
}

/*#include <stdio.h>

int main()
{
	int T;
	scanf("%d",&T);
	long long int A[T];
	for(auto i=0;i<T;i++)
	{
		scanf("%ld",&A[i]);
	}
	for(auto i=0;i<T;i++)
	{
		printf("YES\n");
	}
}*/
