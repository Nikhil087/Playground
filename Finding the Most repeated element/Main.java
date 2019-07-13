#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n];
	for(int i = 0;i < n ;i++)
    {
    scanf("%d",&arr[i]);
    }
  int c =1,max,res;
  for(int i = 0;i < n;i++)
  {
  	for(int j =i+1 ;j < n;j++)
    {
    	if(arr[i] == arr[j])
    	{
    	c++;
    	}
    }
    //int max = c;
    if(c > max)
    {
        max = c;
    	res = arr[i];
        c = 0;
    } 
  }
  printf("%d",res);
  return 0;
}