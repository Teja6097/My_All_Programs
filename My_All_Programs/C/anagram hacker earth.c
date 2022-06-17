#include"stdio.h"
int main()
{
    int t=0;
    char s1[10000]= {};
    char s2[100000]= {};
    scanf("%d",&t);
    for(int y=0; y<t; y++)
    {
        scanf("%s",s1);
        scanf("%s",s2);
        int a[26]= {},b[26]= {};
        for(int i=0; s1[i]; i++)
            if(s1[i]<='Z')
                a[s1[i]-'A']++;
            else
                a[s1[i]-'a']++;
        for(int i=0; s2[i]!=0; i++)
            if(s2[i]<='Z')
                b[s2[i]-'A']++;
            else
                b[s2[i]-'a']++;
        int k=0;
        int sum=0;
        for(int i=0; i<26; i++)
        {
            k=a[i]-b[i];
            if(k<0)
                sum-=k;
            else
                sum+=k;
        }
        printf("%d\n",sum);
    }
    return 0;
}

