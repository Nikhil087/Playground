#include<stdio.h>
int main()
{
  //Type your code here
  int row,col;
  scanf("%d %d",&row,&col);
  int arr[row][col];
  for(int i = 0;i < row;i++)
  {
  	for( int j = 0;j < col;j++)
    {
    	scanf("%d",&arr[i][j]);
    }
  }
  for(int i = 0;i < col;i++)
  {
  	for( int j = 0;j < row;j++)
    {
    	printf("%d ",arr[j][i]);
    }
    printf("\n");
  }
  return 0;
}