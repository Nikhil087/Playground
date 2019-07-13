import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner s = new Scanner(System.in);
      // Type your code here
      int n = s.nextInt();
      int num = 0;
      for(int i = 1;i <= n ;i++)
      {
        for(int k = 1 ;k <= n - i;k++)
        {
        	System.out.print(" ");
        }
      	for(int j = 1;j <= i;j++)
        {
          num = num + 1;
        System.out.print(num+" ");
        }
        System.out.print("\n");
      }
    }    
}