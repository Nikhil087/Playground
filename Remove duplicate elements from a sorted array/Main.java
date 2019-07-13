#include <stdio.h>
int main() 
{
    //write your logic here
  int size;
  scanf("%d",&size);
  int a[size];
  for(int i = 0;i < size;i++)
  {
  	scanf("%d",&a[i]);
  }
  for(int i = 1;i < size;i++)
  	{
  		if(a[i-1] == a[i])
        {
        	for(int j = i; j < size;j++)
        	{
        		a[j] = a[j+1];
        	}
          size= size-1;
        }
  	}
  for(int i = 0;i < size;i++)
  	{
  printf("%d ",a[i]);
  }
	return 0;
}