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
  for(int i = size-1;i >= 0;i--)
  {
  	for(int j = 0;j < i;j++)
    {
    	if(arr[j] > arr[j+1])
        {
        int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
        }
    }
  }
  for(int i = 0;i < size;i++)
  {
  	printf("%d\n",arr[i]);
  }
  return 0;
}