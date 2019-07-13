#include<stdio.h>
int main()
{
 //Type your code here
  int size;
  scanf("%d",&size);
  int arr[size];
  for(int i =0;i < size;i++)
  {
  scanf("%d",&arr[i]);
  }
  int isr;
  scanf("%d",&isr);
  arr[size] = isr;
  for(int i =0; i < size+1;i++)
  {
  	for(int j = i+1;j < size+1;j++)
    {
    if(arr[i]>arr[j])
    {
    int tem = arr[i];
      arr[i] = arr[j];
      arr[j] = tem;
    }
    }
  }
  for(int i =0;i < size+1;i++)
  {
    printf("%d ",arr[i]);
  }
  
  return 0;
}