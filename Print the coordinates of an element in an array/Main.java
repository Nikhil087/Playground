#include<stdio.h>
int main()
{
  //Type your code here
  int arr1,arr2;
  scanf("%d%d",&arr1,&arr2);
  int arr[arr1][arr2];
  for(int i = 0;i < arr1;i++)
  {
  	for(int j = 0;j < arr2;j++)
    {
    	scanf("%d",&arr[i][j]);
    }
  }
  int s,i,j,flag=0;
  scanf("%d",&s);
  for(i = 0;i < arr1;i++)
  {
  	for(j = 0;j < arr2;j++)
    {
   		if(arr[i][j] == s)
        {
        flag = 1;
          break;
        }
    }
    if(flag == 1)
    {
    break;
    }
  }
if(flag == 1)
{
printf("(%d, %d)",i,j);
}
  else
  {
  printf("(-1, -1)");
  }
  return 0;
}