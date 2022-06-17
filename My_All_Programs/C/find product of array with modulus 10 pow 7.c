#include<stdio.h>
#include<math.h>
int main()
{
long long int num,answer=1,ind;
scanf("%lld",&num);
long long int arr[num];
for(ind=0;ind<num;ind++)
{
	scanf("%lld",&arr[ind]);
}
for(ind=0;ind<num;ind++)
{
	answer=(answer*arr[ind]) % (1000000007);
}
printf("%lld",answer);
return 0;

}
