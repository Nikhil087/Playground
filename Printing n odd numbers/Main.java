import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
	     // Type your code here
      int n = s.nextInt();
      int c=0;
      for(int i = 1;i > 0;i++)
      {
        if(i % 2 == 1)
        {
      	System.out.println(i);
      		c++;
        }
        if(c == n)
        {
        break;
        }
      }
	}
}