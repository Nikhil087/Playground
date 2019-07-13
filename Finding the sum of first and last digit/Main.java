#include <stdio.h>
int main() {
	//Type your code
  int n,sum = 0;
  scanf("%d",&n);
   int r = n % 10;
  while(n >= 100)
  {
  	n /= 10;
  }
  int m = n/10;
	sum = m + r;
  printf("%d",sum);
	return 0;
}