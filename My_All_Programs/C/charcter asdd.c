#include<stdio.h>
char charEncrypt( char character,int key)
{
    int j;
    j=key%26;
    char s=j+character;
    if(s>'z'||s>'Z')
    {
        return s-26;
    }
    else
    {

        return s;
    }
}
int main()
{
    int n,i,j;
    char k,s;
    scanf("%c",&k);
    scanf("%d",&n);
    char result;
    result = charEncrypt(k,n);
    printf("%c",result);
    return 0;
}
