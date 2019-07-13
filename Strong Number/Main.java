import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();int fact=1;int sum = 0;
      int n1 = n;
      while(n != 0)
      {
       	int m = n % 10;	
        
        for (int c = 1; c <= m; c++)
        {fact = fact*c;}
     		
        sum += fact;
        fact = 1; 
		n = n/10;      
      }
      if(sum == n1)
      {System.out.println("Yes");}
      else
      {System.out.println("No");}
	}
}