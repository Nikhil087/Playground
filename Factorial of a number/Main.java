import java.util.Scanner;
class Main{
	public static void main (String[] args){
       int n, c, fact = 1;
     
    
      Scanner in = new Scanner(System.in);
     
      n = in.nextInt();
    
         for (c = 1; c <= n; c++)
            fact = fact*c;
     
         System.out.println(fact);
  
	}
}