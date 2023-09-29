
#include <stdio.h>
int main()
{
    char borze[20];
    scanf("%s", &borze);
    int value = 0;
    for (int i = 0; i < 20; i++)
    {
        if (borze[i] == '.')
        {
            value = value * 10 + 0;
        }
        else if (borze[i] == '-' && borze[i + 1] == '.')
        {
            value = value * 10 + 1;
        }
        else if (borze[i] == '-' && borze[i + 1] == '-')

        {
            value = value * 10 + 2;
        }
    }
    printf("%d", value);
    return 0;
}