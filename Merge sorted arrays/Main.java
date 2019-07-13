#include <stdio.h>
int main() 
{
	//write your code here
  int arr_size_1;
  int arr_size_2;
  scanf("%d%d",&arr_size_1,&arr_size_2);
  int arr1[arr_size_1],arr2[arr_size_2];
  for(int i = 0;i < arr_size_1;i++)
  {
  	scanf("%d",&arr1[i]);
  }
  for(int i = 0;i < arr_size_2;i++)
  {
  	scanf("%d",&arr2[i]);
  }
  int n = arr_size_1 + arr_size_2;
  int temp[n];
  int p=0,q=0;
  for(int i = 0;i < n;i++)
  {
  	if(p < arr_size_1 && q < arr_size_2)
    {
    	if(arr1[p] < arr2[q])
        {
        	temp[i] = arr1[p];
          p++;
        }
      else
      {
      temp[i] = arr2[q];
      q++;
      }
    }
    else if(p == arr_size_1)
    {
    	for(int k = i;k < n;k++)
        {
        	temp[k] = arr2[q];q++;i++;
        }
    }
    else
       {
    	for(int k = i;k < n;k++)
        {
        	temp[k] = arr1[p];p++;i++;
        }
    }
  }
  for(int i = 0;i < n;i++)
  {
  printf("%d ",temp[i]);
  }
	return 0;
}