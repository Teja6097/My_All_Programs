#include<stdio.h>
int power(int num,int n)
{
    int res=1,temp=num;
    while(n!=0)
    {
        res*=num;
        n--;
    }
    return res;

}
int change(int num)
{
    int i,j,c;
    switch(num)
    {
        case 0 : c=9; break;
        case 1 : c=8; break;
        case 2 : c=7; break;
        case 3 : c=6; break;
        case 4 : c=5; break;
        case 5 : c=4; break;
        case 6 : c=3; break;
        case 7 : c=2; break;
        case 8 : c=1; break;
        case 9 : c=0;

    }
    return c;
}
int main()
{
    int num,i,j,b,temp,rem,a=0,d=0;
    printf("Enter the number: ");
    scanf("%d",&num);
    temp=num;
    if(num>=0 && num<=1000000)
    {


    while(temp!=0)
    {
        rem=temp%10;
        b=change(rem);
        int e= power(10,a);
        d=d+e*b;
        a++;
        temp=temp/10;

    }
    printf("%d",d);
    }
    else
    {
        printf("Wrong Input");
    }

    return 0;
}
