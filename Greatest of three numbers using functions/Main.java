import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n1= s.nextInt();
      int n2 = s.nextInt();
      int n3 = s.nextInt();
      System.out.println(bigest(n1,n2,n3));
	}
  public static int bigest(int num1,int num2 ,int num3)
  {
  if(num1 > num2 && num1 > num3)
  {
  return num1;
  }
    else if(num2 > num1 && num2 > num3)
    {
    return num2;
    }
    else
      return num3;
  }
}