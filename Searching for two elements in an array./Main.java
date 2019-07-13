#include<stdio.h>
int main()
{
  //Type your code here
  int n,arr[10];
  scanf("%d\n",&n);
  for(int i =0;i < n;i++)
  {
  scanf("%d",&arr[i]);
  }
  int s1,s2;
  scanf("%d\n",&s1);
  scanf("%d",&s2);
   if(s1 >= 1000)
  {
  printf("-1");
  }
  for(int i = 0 ;i < n;i++)
  {
  if(s1 == arr[i] || s2 == arr[i])
  {
  printf("%d\n",i);
  }
  }
  if(s2 >= 1000)
  {
  printf("-1");
  }
  return 0;
}