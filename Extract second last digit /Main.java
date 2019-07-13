import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n;
      Scanner sc =new Scanner(System.in);
      n = sc.nextInt();
      n = n /10; 
      n = n % 10;
      System.out.println(n);
	}
}