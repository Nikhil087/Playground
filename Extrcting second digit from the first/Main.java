#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  while(n >= 100)
  {
  n = n/10;
  }
  n = n % 10;
  printf("%d",n);
	return 0;
}