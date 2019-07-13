import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i < n;i++)
      {
      arr[i] = s.nextInt();
      }
      int temp[] = new int[n];
      int j = 0;
      for(int i = 0;i<n;i++)
      {
      	if(arr[i] > 0)
        {
        temp[j] =arr[i];
          j++;
        }
      }
      for(int i = 0;i < n;i++)
      {
      if(i < j)
      {
      System.out.print(temp[i]+" ");
      }
        else
        {
        System.out.print("0 ");
        }
      }
    }
}