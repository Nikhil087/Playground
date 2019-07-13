import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int  m = 3;
    int  i ;
    for( i = 1;i <= n;i++)
    {

      System
        .out.print(i);
      	    if(i % m == 0)
        {
    	System.out.print(",");
        }
   }
  }
}