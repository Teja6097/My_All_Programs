#include<stdio.h>
int main()
{
    int i,j, k,count=0,len;
    char str[100000],s[3];
    scanf("%s",&str);
    len=strlen(str);
    for(i=0;i<len-2;i++)
    {
        for(j=i+1;j<len-1;j++)
        {
            for(k=j+1;k<len;k++)
            {
                if((str[i]=='M' && str[j]=='O' && str[k]=='M') ||(str[i]=='D' && str[j]=='A' && str[k]=='D'))
                {
                    count++;
                }
            }
        }
    }
    printf("%d",count);

    return 0;
}
