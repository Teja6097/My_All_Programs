#include<stdio.h>

int main()
{
    int t,n,i,count;
    scanf("%d",&t);
    while(t--)
    {
        scanf("%d",&n);
        char str[n];
        scanf("%s",str);
        count=0;
        for(i=0;i<n;i++)

            //if(str[i]=="a" && str[i]=="e" && str[i]=="i" && str[i]=="o" && str[i]=="u")
            if(str[i]!='a' && str[i]!='e' && str[i]!='i' && str[i]!='o' && str[i]!='u')
            {
                //if(str[i-1]!="a" && str[i-1]!="e" && str[i-1]!="i" && str[i-1]!="o" && str[i-1]!="u")
                if(str[i+1]=='a' || str[i+1]=='e' || str[i+1]=='i' || str[i+1]=='o' || str[i+1]=='u')
                {
                    count++;
                }
                else
                {
                    continue;
                }
            }
            else
                {
                    continue;
                }
        }
        printf("%d",count);

    return 0;
}
