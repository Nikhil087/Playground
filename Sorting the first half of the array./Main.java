import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i < n;i++)
    {
    arr[i] = s.nextInt();
    }
    int m = arr.length/2;
    for(int i = 0;i <m;i++)
    {
    	for(int j =i+1;j < m;j++)
        {
      	if(arr[i] > arr[j])
        {
        int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }  
    }
  }
    for(int i = 0;i<arr.length;i++)
    {
    System.out.print(arr[i]+" ");
    }
}
}
