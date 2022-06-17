#include<stdio.h>

int main()
{
    int rem,num,temp,n,ans;
    char ch[10];
    printf("Enter the day: ");
    scanf("%s",&ch);
    printf("Enter number of days: ");
    scanf("%d",&num);
    rem=num%7;
    if(strcmp(ch,"sunday")==1)
    {
        n=0;
    }
    else if(strcmp(ch, "monday")==1)
    {
        n=1;
    }
    else if(strcmp(ch,"tuesday")==1 )
    {
        n=2;
    }
    else if(strcmp(ch,"wednesday")==1)
    {
        n=3;
    }
    else if(strcmp(ch,"thursday")==1)
    {
        n=4;
    }
    else if(strcmp(ch,"friday")==1)
    {
        n=5;
    }
    else //if(ch=="saturday")
    {
        n=6;
    }
    /*
    else
    {
        printf("Enter correct day");
        //return 0;
    }
    */
    ans=(rem+n)%7;
    switch(ans)
    {
        case 0: printf("Sunday"); break;
        case 1: printf("Monday"); break;
        case 2: printf("Tuesday"); break;
        case 3: printf("Wednesday"); break;
        case 4: printf("Thursday"); break;
        case 5: printf("Friday"); break;
        case 6: printf("Saturday"); break;
        default: printf("nil");
    }

    return 0;
}
