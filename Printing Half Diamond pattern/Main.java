import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int p = n ;
      for(int i =1;i <= n;i++)
      {
        for(int k = 1; k <= n - i ;k++ )
        {
        System.out.print(" ");
        }
      	for(int j = 1 ;j <= i + (n - p) ; j++ )
        {
        System.out.print("*");
        }
        p = p-1;
        System.out.print("\n");
      }
	}
}