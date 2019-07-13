#include<stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int sum = sum_num(n);
  printf("%d",sum);
  
  	return 0;
}
int sum_num(int num)
{
	return (num*(num + 1))/2;
}