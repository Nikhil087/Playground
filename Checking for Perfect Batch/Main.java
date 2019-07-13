import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    for(int i =0;i < n;i++)
    {
    arr[i] = s.nextInt();
    }
    sum_of_three(arr,n);
  }
  public static void sum_of_three(int ray[],int num)
  {
    int sum1 = 0,sum2 = 0;
  for(int i = 0;i< num;i++)
  {
  	if(i < 3)
    {
    sum1 = sum1+ray[i];
      
    }
  }
    int c =0;
  for(int i = num-1;i > 0 ;i--)  
    {
    c++;
    sum2 = sum2 +ray[i]; 
    if( c == 3)
    {
    break;
    }
  }
    if(sum1 == sum2)
    {
    System.out.print("Perfect Batch");
    }
    else
    {
    System.out.print("Not a Perfect Batch");
    }
  }
}