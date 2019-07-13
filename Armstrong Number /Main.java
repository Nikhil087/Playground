import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int res = 0;
      int p = n;
      int n1 = n;
      int c=0;
      while(p != 0)
      {
        p = p / 10;
        c++;
      }
      while(n != 0)
      {
      	int m = n % 10;
        res =res + power(m,c); 
          n= n/10;
      }
      if(n1 == res)
     	{
      System.out.println("Armstrong Number");
      }
      else
        System.out.println("Not a Armstrong Number");
	}
  
   static int power(int n, int r) {
      int c, p = 1;
 
      for (c = 1; c <= r; c++)
         p = p*n;
 
      return p;  
   }
  
  
}