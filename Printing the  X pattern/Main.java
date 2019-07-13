#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int p = n;
  for(int i = 1;i <= n;i++)
  {
  	for(int j = 1;j <= n;j++)
    {
      if(j == i)
      {
        printf("*");
      }
      else if(j == p && j != i)
      {
      printf("*");
      }
      else
        printf(" ");
    }
    p = p-1;
    printf("\n");
    }

	return 0;
}