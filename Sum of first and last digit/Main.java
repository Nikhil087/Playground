import java.util.Scanner;
class Main {
	public static void main (String[] args){
	 Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int temp = n;
      while(n > 10)
      {
      n = n / 10;
      }
      int sum = n + temp % 10;
      System.out.println(sum);
	}
}