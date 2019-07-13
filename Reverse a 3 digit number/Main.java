import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int num,rever=0;
    Scanner sc = new Scanner(System.in);
    num =sc.nextInt();
    while ( num != 0)
    {
    	rever = rever * 10;
      	rever = rever + num % 10;
      	num = num / 10;
    }
    System.out.println(rever);
  }
}