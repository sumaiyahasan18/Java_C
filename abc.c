#include<stdio.h>
#include<string.h>
int main()
{
   int arraySize;
   scanf("%d",&arraySize);
   char name[arraySize];
   scanf("%s",name);
   //gets(name);
   printf("%s",name);
  // printf("%d",arraySize);
   printf("%d",sizeof(name));
}