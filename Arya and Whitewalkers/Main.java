#include <stdio.h>
int main() {
	//write your code here
  int n;
  scanf("%d",&n);
  int c = 0;
  while(n!=0)
  {
  	if(n%2 == 1)
    {
    c++;
    }
    n = n/2;
  }
  printf("%d",c);
	return 0;
}