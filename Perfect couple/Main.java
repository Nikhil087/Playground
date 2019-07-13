#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(arr, size, sum);
    return 0;
}

void check_sum_and_display(int arr[], int size, int sum)
{
  // Type your code here
  int index1,index2,flag=0,userSum=0;
  for(int i = 0;i < size;i++)
  {
  	for(int j =i+1;j < size;j++)
    {
    userSum = arr[i]+arr[j];
    	if(userSum == sum)
    	{
    	  index1 = arr[i];
    	  index2 = arr[j];
    	  flag = 1;
    	  break;
    	}
      userSum = 0;
    }
    //printf("\n");
  }
  if(flag == 1)
  {
  printf("Perfect couple: %d %d",index1,index2);
  }
  else
  {
  printf("No perfect couple found!");
  }
}