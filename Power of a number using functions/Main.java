import java.util.Scanner;
class Main{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
  int n = s.nextInt();
  int m =s.nextInt();
	power(n,m);
}
  public static void power(int num,int num2)
  {
    int sum = 1;
    for(int i = 1;i <= num2;i++)
    {
    	sum =sum * num;
    }
  	System.out.print(sum);
  }
}