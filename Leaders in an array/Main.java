#include <stdio.h>
int main() 
{
    //write your code here
  int s;
  scanf("%d",&s);
  int arr[s];
  for(int i = 0;i < s;i++)
  {
  scanf("%d",&arr[i]);
  }
   for(int i = 0;i < s;i++)
  {
    int flag =0;
     	for(int j = i+1;j < s;j++)
    	{
    		if(arr[i] > arr[j])
              {
                flag = 1;
              }
          	else
          	  {
            	flag = 0;
              break;
        	  }
   		}
   	if(flag == 1 || i == s-1)
    {
    printf("%d ",arr[i]);
    }
   }
    return 0;
}