#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i = 0; i < n ;i++)
  {
  	scanf("%d",&arr[i]);
  }
  int res[n];
  int i = 1;
  res[0] = arr[0];
  for (int c = 1 ; c <= n - 1; c++) {
    int d = c;
 
    while ( d > 0 && arr[d-1] > arr[d]) {
      int t  = arr[d];
      arr[d]   = arr[d-1];
      arr[d-1] = t;
 
      d--;
    }
  }
  for(int i = 0;i < n;i++)
  {
  printf("%d\n",arr[i])
;  }
  return 0;
}