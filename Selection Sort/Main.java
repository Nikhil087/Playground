#include<stdio.h>
int main()
{
  //Type your code here
  int size;
  scanf("%d",&size);
  int arr[size];
  for(int i = 0;i < size;i++)
  {
  	scanf("%d",&arr[i]);
  }
  for(int i = 0;i < size;i++)
  {
    int min = i;
  	for(int j = i+1;j<size;j++)
    	{
  		  	if(arr[j] < arr[min])
            {
            min = j;
            }
    	}
    int temp = arr[min];
    arr[min] = arr[i];
    arr[i] = temp;
  }
  for(int i = 0;i < size;i++)
  {
  	printf("%d\n",arr[i]);
  }
  return 0;
}