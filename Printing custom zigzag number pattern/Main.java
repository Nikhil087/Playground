import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      for(int i = 1;i <= n;i++)
      {
        for(int j = 1;j<=n;j++)
        {
        if(i % 2 == 1 && j == n ){
        i = i+1;
          System.out.print(i);
          i = i- 1;
        }
          else if( i % 2 == 0 && j == 1)
          {
            i = i+1;
          System.out.print(i);
            i = i-1;
          }
          else
          {
          System.out.print(i);
          }
        }
      System.out.print("\n");
      }
	}
}