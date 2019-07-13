/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i =0;i<n;i++)
  {
  	scanf("%d",&arr[i]);
  }
  fsum(arr,n);
  //Type your code here
  return 0;
}
void fsum(int list[],int a)
{
int sum1 =0,sum2=0;
  for(int i = 0;i<a/2;i++)
  {
  sum1 +=list[i];
  }
   for(int i = a/2;i<a;i++)
  {
  sum2 +=list[i];
  }
  if(sum1 == sum2)
  {
  printf("Perfect Batch");
  }
  else
  {
  printf("Not a Perfect Batch");
  }
}