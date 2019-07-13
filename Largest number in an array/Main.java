#include<stdio.h>
int main()
{
  //fill the code
  int n,arr[10];
  scanf("%d",&n);
  for(int i = 0;i < n;i++)
  {
  scanf("%d",&arr[i]);
  }
  int lar = arr[1];
   for(int i = 0;i < n;i++)
  {
     if(arr[i] > lar)
     {
     lar = arr[i];
     }
 //scanf("%d",&arr[i]);
  }
  printf("%d",lar);
  return 0;
}