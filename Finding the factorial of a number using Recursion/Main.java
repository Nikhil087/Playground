#include<stdio.h>
int main()
{
	//Try out your code here
int num;
  scanf("%d",&num);
  int ans = fact(num);
  printf("%d",ans);
  return 0;
}
int fact(int n)
{
if(n == 1)
{
	return;
}
  int sum = n * fact(n-1);
  return sum;
}