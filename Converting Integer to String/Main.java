import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
  StringBuilder temp1 = new StringBuilder();
    char arr[] = new char[10];
    int i ;
    if(num < 0)
    {
    //temp1.append(arr[0] = '-');
      System.out.print("-");
      num = num * -1;
    }
    int c = 0,temp = num;
    while(num != 0)
    { 
      num = num/10;
    	c++;
    }
    while(temp != 0)
    {
      int n = temp;
    char ch = (char)((n % 10) + '0');
      temp1.append(ch);
      temp = temp/10;
    }
    String ss = temp1.substring(0);
    temp1 = new StringBuilder();
    for(i = ss.length()-1;i >= 0;i--)
    {
    	temp1.append(ss.charAt(i));
    }
    System.out.print(temp1);
  }
}
