import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner s = new Scanner(System.in);
    String ss = s.nextLine();
    String arr[] = ss.split(" ");
    int len = arr.length;
    for(int i = 0;i < len;i++)
    {
    	String temp = arr[i];
      	int l = temp.length();
      for(int j = l-1;j >=0 ;j--)
      {
      System.out.print(temp.charAt(j));
      }
      System.out.print(" ");
    }
   // System.out.print(len);
  }
}
