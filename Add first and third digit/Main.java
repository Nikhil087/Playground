import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int n;
      Scanner sc = new Scanner(System.in)
        ;
      n = sc.nextInt();
    	int sum = n / 100 + n % 10;
      System.out.println(sum);
      
	}
}