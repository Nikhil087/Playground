import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner s = new Scanner(System.in);
    int n =s.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i <n;i++)
    {
    arr[i] = s.nextInt();
    }
    int temp[] = new int[10];
    int j =0,sum = 0;
    sum = arr[0];
    for(int i = 1;i < n;i++)
    {
    	if(arr[i] > arr[i-1])
        {
        sum = sum+arr[i];
          //System.out.println(sum);
        temp[j++] = sum;
        }
      	else
        {
        sum = arr[i];
       // System.out.println(temp[j]);
        }
    }
    int min = 0;
    for(int i = 0;i < j;i++)
    {
      if(temp[i] > min)
      {
        
      min = temp[i];
      }
    }
    System.out.print(min);
    
  }
}
