#include<stdio.h>
int main()
{
	//Try out your code here
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
  int arr1[row][col];
   for(int i = 0;i < row;i++)
  {
  	for( int j = 0;j < col;j++)
    {
    	scanf("%d",&arr1[i][j]);
    }
  }
  int sub[row][col];
  for(int i = 0;i < row;i++)
  {
  	for( int j = 0;j < col;j++)
    {
      sub[i][j] = arr[i][j] - arr1[i][j];
    	printf("%d ",sub[i][j]);
    }
    printf("\n");
  }
  
  
  
	return 0;
}