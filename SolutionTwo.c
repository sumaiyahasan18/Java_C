#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{
    int rows = 5;
    int colms = 5;
    int moves;
    int arr[5][5];
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            // printf("%d", arr[i][j]);
            if (arr[i][j] == 1)
            {
                moves = (abs(i - 2)) + (abs(j - 2));
                printf("%d", moves);
                break;
            }
        }
    }

    return 0;
}