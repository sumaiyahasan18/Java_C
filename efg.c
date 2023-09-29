#include <stdio.h>
int main()
{
    int num, a;
    int sum = 0;
    scanf("%d", &num);
    for (int i = 1; i <= num; i++)
    {
        scanf("%d", &a);
        sum = sum + a;
    }
    printf("%d", sum);
    return 0;
}