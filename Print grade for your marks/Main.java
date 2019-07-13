import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int num;
      Scanner s = new Scanner(System.in);
      num = s.nextInt();
      if(num >= 85)
      {
         System.out.println("A");
      
      }
      else if(num >=75 && num < 85)
      {
         System.out.println("B");
      
      }
      else if(num >=65 && num < 75)
      {
         System.out.println("C");
      }
      else if(num >=55 && num < 65)
      {
         System.out.println("D");
      }
      else if(num >= 45 && num < 55)
      {
      System.out.println("E");
      }
      else
      {
      System.out.println("Fail");
      }
    }
}