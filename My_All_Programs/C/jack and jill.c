#include <stdlib.h>

#include <stdio.h>


int words[8];


int wordcount(char *string)
{

    int i;


    for (i=0; *string; ++string)
    {

        if (*string != ' ' && *string != '\t')
        {

            ++i;

        }
        else
        {

            words[i] += 1;

            i = 0;

        }

    }

    if (i)
    {
        words[i] += 1;
    }
}


int main()

{

    int i;



    for (i = 1; i < 5; ++i)
    {

        printf("%d-letter word is - %d\n", i, words[i]);

    }


}
