import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i < n;i++)
      {
      arr[i] =s.nextInt();
      }
      int c = 0,j=0;
      int temp[] = new int[n];
       for(int i = 0;i < n;i++)
      {
     		if(arr[i] == 0)
            {
            temp[j++] = c;
            c=0;
            }
         else
         {
		c++;
       }
       }
      int min =0;  
      for(int i = 0;i < j;i++)
      {
        if(temp[i] > 0)
      	  {
      		  min = temp[i];
          }
      }
      System.out.print(min);
    }
}
