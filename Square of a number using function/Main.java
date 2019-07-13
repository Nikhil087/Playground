import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      square(n);
	} 
  public static void square(int num)
{
int sum = num * num;
  System.out.print(sum);
  
}
}
