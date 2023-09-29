#include <stdio.h>
int main()
{
    int y;
    scanf("%d", &y);
    for (int i = y + 1; i <= 9500; i++)
    {
        int x = i;
        int a = x % 10;
        x = x / 10;
        int b = x % 10;
        x = x / 10;
        int c = x % 10;
        x = x / 10;
        int d = x % 10;
        if (a != b && a != c && a != d && b != c && b != d && c != d)
        {
            printf("%d", i);
            break;
        }
    }
}