#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i =0;i < n;i++)
  {
    
  	scanf("%d",&arr[i]);
  }
  int flag = 0,res,p=1;
  for(int i = 0;i < n;i++)
  {
   if(arr[i] != p)
   {
   printf("%d", p);
     break;
   }
    else
    {
    p = p+1;
    }
  }
  return 0;
}