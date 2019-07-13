import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	 Scanner s = new Scanner(System.in);
      int n1= s.nextInt();
      int n2 = s.nextInt();
      int n3 = s.nextInt();
      System.out.println(bigest(n1,n2,n3));
	}
  public static int bigest(int num1,int num2 ,int num3)
  {
    int min;
  if(num1 > num2 && num1 > num3)
  {
  min = num1;
  }
    else if(num2 > num1 && num2 > num3)
    {
    min = num2;
    }
    else
      min = num3;
    while(min > 0)
    {
    if(num1 % min == 0 && num2 % min == 0 && num3 % min == 0)
    {
      //return min;
    break;
    }
      else
        min--;
    
    }
    return min;
  }
}