import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int p =0;
      for(int i = 1;i <= n;i++)
      {
      	for(int j = 1;j <= n;j++)
        {
        	if(j == i || j == n - p)
            {
            System.out.print("*");
            }
          else
         {
          System.out.print(" ");
          }
        
        }
        p =  p+1;
        System.out.print("\n");
      }
	}
}